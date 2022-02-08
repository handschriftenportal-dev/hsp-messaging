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

import com.thaiopensource.util.PropertyMap;
import com.thaiopensource.util.PropertyMapBuilder;
import com.thaiopensource.validate.Flag;
import com.thaiopensource.validate.SchemaReader;
import com.thaiopensource.validate.ValidateProperty;
import com.thaiopensource.validate.ValidationDriver;
import com.thaiopensource.validate.auto.AutoSchemaReader;
import com.thaiopensource.validate.prop.rng.RngProperty;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.logging.Logger;
import org.tei_c.ns._1.MacroLimitedContent;
import org.tei_c.ns._1.MacroParaContent;
import org.tei_c.ns._1.MacroPhraseSeq;
import org.tei_c.ns._1.MacroPhraseSeqLimited;
import org.tei_c.ns._1.MacroSpecialPara;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * @author Piotr.Czarnecki@sbb.spk-berlin.de
 * @since 21.04.20
 */
public class TEICommon {

  private static final Logger log = Logger.getLogger(TEICommon.class.getName());
  public static final String TEI_RELAXNG_TEI_ALL_RNG = "tei/relaxng/tei_all.rng";
  public static final String TEI_SCHEMATRON_TEI_ALL_ISOSCH = "tei/schematron/tei_all.isosch";
  public static final String TEI_RELAXNG_TEI_ODD_RNG = "tei/relaxng/hsp_cataloguing.rng";
  public static final String TEI_SCHEMATRON_TEI_ODD_ISOSCH = "tei/schematron/hsp_cataloguing.isosch";

  private TEICommon() {
    throw new IllegalArgumentException("Utility class");
  }

  static {
    System.setProperty("javax.xml.transform.TransformerFactory",
        "net.sf.saxon.TransformerFactoryImpl");
  }

  public static boolean validate(String tei) throws SAXException, IOException {

    boolean validationResult = false;

    if (validateSchemaWithJingLib(tei, TEI_RELAXNG_TEI_ALL_RNG)) {
      validationResult = validateSchemaWithJingLib(tei, TEI_SCHEMATRON_TEI_ALL_ISOSCH);
    }
    return validationResult;
  }

  public static boolean validateWithODD(String tei) throws IOException, SAXException {
    boolean validationResult = false;

    if (validateSchemaWithJingLib(tei, TEI_RELAXNG_TEI_ODD_RNG)) {
      validationResult = validateSchemaWithJingLib(tei, TEI_SCHEMATRON_TEI_ODD_ISOSCH);
    }

    return validationResult;
  }

  private static boolean validateSchemaWithJingLib(String xml,
      String resourceAsStreamPath) throws IOException, SAXException {

    log.fine("Start validateSchemaWithJingLib " + resourceAsStreamPath);

    boolean validationResult;

    try (InputStream schemaFileResource = TEICommon.class.getClassLoader()
        .getResourceAsStream(resourceAsStreamPath)) {
      InputSource inputSource = new InputSource(schemaFileResource);

      SchemaReader autoSchemaReader = new AutoSchemaReader();
      ValidationDriver driver = new ValidationDriver(getPropertyMapWithErrorHandler(),
          autoSchemaReader);
      inputSource.setEncoding("UTF-8");
      driver.loadSchema(inputSource);
      InputSource inXml = new InputSource(new StringReader(xml));
      inXml.setEncoding("UTF-8");
      validationResult = driver.validate(inXml);

      log.fine("End validationResult {} " + validationResult);
    }

    return validationResult;
  }

  private static PropertyMap getPropertyMapWithErrorHandler() {
    ErrorHandler errorHandler = new ErrorHandler() {
      @Override
      public void warning(SAXParseException exception) throws SAXException {
        throw exception;
      }

      @Override
      public void error(SAXParseException exception) throws SAXException {
        throw exception;
      }

      @Override
      public void fatalError(SAXParseException exception) throws SAXException {
        throw exception;
      }
    };
    PropertyMapBuilder propertyMapBuilder = new PropertyMapBuilder();
    propertyMapBuilder.put(ValidateProperty.ERROR_HANDLER, errorHandler);
    propertyMapBuilder.put(RngProperty.CHECK_ID_IDREF, Flag.PRESENT);
    return propertyMapBuilder.toPropertyMap();
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
        } else {
          System.out
              .println("Not handled content for the class: " + o.getClass().getCanonicalName());
        }
      }
    }
  }

}
