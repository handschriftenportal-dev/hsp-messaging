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

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
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

  static {
    System.setProperty("javax.xml.transform.TransformerFactory",
        "net.sf.saxon.TransformerFactoryImpl");
  }

  private TEICommon() {
    throw new IllegalArgumentException("Utility class");
  }

  public static <T> Optional<T> findFirst(final Class<T> clazz, final Object object)
      throws Exception {

    if (Objects.nonNull(object)) {
      List<T> result = new LinkedList<>();
      findAll(clazz, object, result);
      return result.stream().findFirst();
    }

    return Optional.empty();
  }

  public static <T> void findAll(final Class<T> clazz, final Object object, List<T> result)
      throws Exception {
    if (Objects.nonNull(object)) {
      Class<?> currentObjectClass = object.getClass();
      if (currentObjectClass.isAssignableFrom(clazz)) {
        result.add((T) object);
      } else if (Iterable.class.isAssignableFrom(currentObjectClass)) {
        for (Object iterableElement : (Iterable<?>) object) {
          findAll(clazz, iterableElement, result);
        }
      } else if (currentObjectClass.getPackageName().startsWith("org.tei_c.ns")) {
        for (Method method : currentObjectClass.getMethods()) {
          if (method.getName().startsWith("get") && method.getParameterCount() == 0) {
            if (Iterable.class.isAssignableFrom(method.getReturnType())) {
              if (!method.toGenericString().contains("java.lang.String")) {
                for (Object o : (Iterable<? extends Object>) method.invoke(object)) {
                  findAll(clazz, o, result);
                }
              }
            } else {
              if (!method.toGenericString().contains("java.lang.String")) {
                findAll(clazz, method.invoke(object), result);
              }
            }
          }
        }
      }
    }
  }

  public static String getContentAsString(List content) {
    return getContentAsString(content, " ");
  }

  public static String getContentAsString(List content, String delimiter) {
    return getContentAsString(content, delimiter, "", "");
  }

  public static String getContentAsString(List content, String delimiter, String prefix,
      String suffix) {
    StringJoiner joiner = new StringJoiner(delimiter, prefix, suffix);
    walkThruContent(joiner, content);
    return joiner.toString().trim();
  }

  private static void walkThruContent(StringJoiner joiner, List content) {
    for (Object o : content) {
      if (o != null) {
        if (o instanceof String) {
          String trim = ((String) o).trim();
          joiner.add(trim);
        } else if (o instanceof MacroParaContent) {
          walkThruContent(joiner, ((MacroParaContent) o).getContent());
        } else if (o instanceof MacroLimitedContent) {
          walkThruContent(joiner, ((MacroLimitedContent) o).getContent());
        } else if (o instanceof MacroPhraseSeq) {
          walkThruContent(joiner, ((MacroPhraseSeq) o).getContent());
        } else if (o instanceof MacroPhraseSeqLimited) {
          walkThruContent(joiner, ((MacroPhraseSeqLimited) o).getContent());
        } else if (o instanceof MacroSpecialPara) {
          walkThruContent(joiner, ((MacroSpecialPara) o).getContent());
        } else if (o instanceof Height) {
          walkThruContent(joiner, ((Height) o).getContent());
        } else if (o instanceof Width) {
          walkThruContent(joiner, ((Width) o).getContent());
        } else if (o instanceof Idno) {
          walkThruContent(joiner, ((Idno) o).getContent());
        } else if (o instanceof OrigDate) {
          walkThruContent(joiner, ((OrigDate) o).getContent());
        } else if (o instanceof Pb) {
          walkThruContent(joiner, List.of("\n"));
        } else if (o instanceof Lb) {
          walkThruContent(joiner, List.of("\n"));
        } else {
          throw new RuntimeException("Not handled content for the class: " + o.getClass().getCanonicalName());
        }
      }
    }
  }

}
