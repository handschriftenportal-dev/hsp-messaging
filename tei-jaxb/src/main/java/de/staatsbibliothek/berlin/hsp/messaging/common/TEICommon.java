/*
 * MIT License
 *
 * Copyright (c) 2020 Staatsbibliothek zu Berlin - Preußischer Kulturbesitz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.staatsbibliothek.berlin.hsp.messaging.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.tei_c.ns._1.Height;
import org.tei_c.ns._1.Idno;
import org.tei_c.ns._1.Lb;
import org.tei_c.ns._1.MacroLimitedContent;
import org.tei_c.ns._1.MacroParaContent;
import org.tei_c.ns._1.MacroPhraseSeq;
import org.tei_c.ns._1.MacroPhraseSeqLimited;
import org.tei_c.ns._1.MacroSpecialPara;
import org.tei_c.ns._1.OrigDate;
import org.tei_c.ns._1.Pb;
import org.tei_c.ns._1.Width;

/**
 * @author Piotr.Czarnecki@sbb.spk-berlin.de
 * @since 21.04.20
 */
public class TEICommon {

  public static final String JAVA_LANG_STRING = "java.lang.String";
  public static final String GET = "get";
  public static final String IS_SET = "isSet";

  // Cache of child properties, keyed by class
  private static final Map<Class<?>, List<ChildProperty>> CHILD_PROPERTIES_CACHE = new ConcurrentHashMap<>();

  private record ChildProperty(Method getter, boolean iterable, Method isSetGuard) {

    /**
     * JAXB generates isSet guards for optional fields only. <br />
     * <code>isSet guard == null</code -> field is required -> always present
     *
     * @param target the object on which to check the presence of the getter's value
     * @return {@code true} if the getter's value is present on {@code target}
     */
    boolean isPresentOn(Object target) throws InvocationTargetException, IllegalAccessException {
      return isSetGuard == null || (boolean) isSetGuard.invoke(target);
    }

    /**
     * The getter's value on {@code target}.
     *
     * @param target the object on which to read the getter's value
     * @return the getter's value on {@code target}
     */
    Object readFrom(Object target) throws InvocationTargetException, IllegalAccessException {
      return getter.invoke(target);
    }
  }

  static {
    System.setProperty("javax.xml.transform.TransformerFactory",
        "net.sf.saxon.TransformerFactoryImpl");
  }

  private TEICommon() {
    throw new IllegalArgumentException("Utility class");
  }

  public static <T> Optional<T> findFirst(final Class<T> targetType, final Object root)
      throws Exception {
    List<T> matches = new LinkedList<>();
    find(true, targetType, root, matches);
    return matches.stream().findFirst();
  }

  public static <T> void findAll(final Class<T> targetType, final Object root, List<T> matches)
      throws Exception {
    find(false, targetType, root, matches);
  }

  /**
   * Depth-first traversal collecting matches into {@code matches}. When {@code firstOnly} is set
   * the walk stops as soon as the first match is collected, so {@link #findFirst} need not scan the
   * rest of the tree — a significant saving on large documents where the target sits near the
   * root.
   */
  private static <T> void find(boolean firstOnly, final Class<T> targetType, final Object root,
      List<T> matches) throws InvocationTargetException, IllegalAccessException {
    if (Objects.isNull(root) || (firstOnly && !matches.isEmpty())) {
      return;
    }

    if (matchesTarget(root, targetType)) {
      matches.add(targetType.cast(root));
    } else if (root instanceof Iterable<?> elements) {
      traverseEach(firstOnly, targetType, elements, matches);
    } else if (isTeiClass(root)) {
      traverseChildren(firstOnly, targetType, root, matches);
    }
  }

  private static <T> void traverseEach(boolean firstOnly, Class<T> targetType,
      Iterable<?> elements, List<T> matches)
      throws InvocationTargetException, IllegalAccessException {
    for (Object element : elements) {
      if (firstOnly && !matches.isEmpty()) {
        return;
      }
      find(firstOnly, targetType, element, matches);
    }
  }

  /**
   * Traverses each set child property of a TEI object, descending into collection-valued
   * properties.
   */
  private static <T> void traverseChildren(boolean firstOnly, Class<T> targetType, Object root,
      List<T> matches) throws InvocationTargetException, IllegalAccessException {
    for (ChildProperty property : childProperties(root.getClass())) {
      if (firstOnly && !matches.isEmpty()) {
        return;
      }
      if (!property.isPresentOn(root)) {
        continue;
      }
      if (property.iterable()) {
        traverseEach(firstOnly, targetType, (Iterable<?>) property.readFrom(root), matches);
      } else {
        find(firstOnly, targetType, property.readFrom(root), matches);
      }
    }
  }

  /**
   * Returns whether {@code root} is an instance of {@code targetType} — i.e. its runtime type is
   * {@code targetType} or a subtype of it.
   *
   * @param root       the candidate object
   * @param targetType the type to match against
   * @return {@code true} if {@code root} is an instance of {@code targetType}
   */
  private static boolean matchesTarget(Object root, Class<?> targetType) {
    return targetType.isInstance(root);
  }

  private static boolean isTeiClass(Object root) {
    Class<?> rootClass = root.getClass();
    return rootClass.getPackageName().startsWith("org.tei_c.ns");
  }

  private static List<ChildProperty> childProperties(Class<?> clazz) {
    return CHILD_PROPERTIES_CACHE.computeIfAbsent(clazz, TEICommon::buildChildProperties);
  }

  /**
   * Builds the child properties for the given class: a list of all zero-arg getters of the class
   * (in Class#getMethods() order, to preserve traversal and thus findFirst ordering), each paired
   * with its optional isSet guard and a boolean indicating whether the getter returns an Iterable.
   *
   * @param clazz the class for which to build the child properties
   * @return the child properties for the given class
   */
  private static List<ChildProperty> buildChildProperties(Class<?> clazz) {
    List<Method> methods = Arrays.stream(clazz.getMethods()).toList();
    Map<String, Method> isSetByGetterName = methods.stream()
        .filter(method -> method.getParameterCount() == 0 && method.getName().startsWith(IS_SET))
        .collect(Collectors.toMap(
            m -> m.getName().replaceFirst(IS_SET, GET),
            m -> m,
            (a, b) -> b)
        );

    return methods.stream()
        .filter(method ->
            method.getParameterCount() == 0 && method.getName().startsWith(GET)
                && !method.toGenericString().contains(JAVA_LANG_STRING))
        .map(method ->
            new ChildProperty(method, Iterable.class.isAssignableFrom(method.getReturnType()),
                isSetByGetterName.get(method.getName())))
        .toList();
  }

  public static String getContentAsString(List<?> content) {
    return getContentAsString(content, " ");
  }

  public static String getContentAsString(List<?> content, String delimiter) {
    return getContentAsString(content, delimiter, "", "");
  }

  public static String getContentAsString(List<?> content, String delimiter, String prefix,
      String suffix) {
    StringJoiner joiner = new StringJoiner(delimiter, prefix, suffix);
    walkThruContent(joiner, content);
    return joiner.toString().trim();
  }

  private static void walkThruContent(StringJoiner joiner, List<?> content) {
    content.stream()
        .filter(Objects::nonNull)
        .forEach(o -> {
          switch (o) {
            case String s -> joiner.add(s.trim());
            case MacroParaContent macroParaContent ->
                walkThruContent(joiner, macroParaContent.getContent());
            case MacroLimitedContent macroLimitedContent ->
                walkThruContent(joiner, macroLimitedContent.getContent());
            case MacroPhraseSeq macroPhraseSeq ->
                walkThruContent(joiner, macroPhraseSeq.getContent());
            case MacroPhraseSeqLimited macroPhraseSeqLimited ->
                walkThruContent(joiner, macroPhraseSeqLimited.getContent());
            case MacroSpecialPara macroSpecialPara ->
                walkThruContent(joiner, macroSpecialPara.getContent());
            case Height height -> walkThruContent(joiner, height.getContent());
            case Width width -> walkThruContent(joiner, width.getContent());
            case Idno idno -> walkThruContent(joiner, idno.getContent());
            case OrigDate origDate -> walkThruContent(joiner, origDate.getContent());
            case Pb pb -> walkThruContent(joiner, List.of("\n"));
            case Lb lb -> walkThruContent(joiner, List.of("\n"));
            default -> throw new RuntimeException(
                "Not handled content for the class: " + o.getClass().getCanonicalName());
          }
        });
  }

}
