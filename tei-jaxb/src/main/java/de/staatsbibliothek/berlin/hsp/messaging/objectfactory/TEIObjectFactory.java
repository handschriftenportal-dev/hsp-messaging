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

package de.staatsbibliothek.berlin.hsp.messaging.objectfactory;

import de.staatsbibliothek.berlin.hsp.messaging.common.TEINamespaceMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.TeiCorpus;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 * @author pc
 * @since 31.03.20
 */
public class TEIObjectFactory {

  public static final String REPLACEMENT = "\n";

  public static final Pattern PATTERN_WHITESPACE_NORMALIZE = Pattern.compile("\\s+\\n");

  /**
   * JAXP entity-size limit applied on the SAX parser used for unmarshalling. Since JDK 24/25 the
   * secure XML defaults restrict {@code jdk.xml.maxGeneralEntitySizeLimit} (and related limits) to
   * 100,000, which makes large but valid TEI import files fail with {@code JAXP00010003}. We raise
   * the limit on the factory level instead of relying on a global JVM system property.
   *
   * <p>The value is a {@code String} because that is what the JAXP properties expect. {@code "0"}
   * disables the limit entirely; the default below is a high but finite value, mirroring the
   * effectively unbounded behaviour seen under JDK 21.
   */
  public static final String ENTITY_SIZE_LIMIT = "0";


  private static final String MAX_GENERAL_ENTITY_SIZE_LIMIT = "jdk.xml.maxGeneralEntitySizeLimit";
  private static final String TOTAL_ENTITY_SIZE_LIMIT = "jdk.xml.totalEntitySizeLimit";

  private static final Logger logger = Logger.getLogger(TEIObjectFactory.class.getName());
  private static JAXBContext teiJaxbContext;

  private TEIObjectFactory() {
  }

  static {
    try {
      teiJaxbContext = JAXBContext.newInstance(TEI.class, TeiCorpus.class);
    } catch (JAXBException jaxbEx) {
      logger.log(Level.FINE, "Error creating JAXBContext", jaxbEx);
      teiJaxbContext = null;
    }
  }

  public static List<TEI> unmarshal(InputStream is) throws JAXBException {
    List<TEI> result = new ArrayList<>();
    Object jaxbResult = unmarshall(is);
    if (TeiCorpus.class.isAssignableFrom(jaxbResult.getClass())) {
      getAllTEI((TeiCorpus) jaxbResult, result);
    } else if (TEI.class.isAssignableFrom(jaxbResult.getClass())) {
      result.add((TEI) jaxbResult);
    }
    return result;
  }

  public static Optional<TEI> unmarshalOne(InputStream inputStream) throws JAXBException {
    Object jaxbResult = unmarshall(inputStream);

    if (TEI.class.isAssignableFrom(jaxbResult.getClass())) {
      return Optional.of((TEI) jaxbResult);
    }

    return Optional.empty();
  }

  private static Object unmarshall(InputStream inputStream) throws JAXBException {
    Unmarshaller jaxbUnmarshaller = teiJaxbContext.createUnmarshaller();
    SAXSource source = new SAXSource(createXMLReader(), new InputSource(inputStream));
    return jaxbUnmarshaller.unmarshal(source);
  }

  /**
   * Creates a namespace-aware {@link XMLReader} that JAXB uses for unmarshalling. It keeps the
   * default (secure) parser configuration and only lifts the JDK 24/25 entity-size limits that
   * would otherwise reject large but valid TEI files.
   */
  private static XMLReader createXMLReader() throws JAXBException {
    try {
      SAXParserFactory factory = SAXParserFactory.newInstance();
      factory.setNamespaceAware(true);
      XMLReader reader = factory.newSAXParser().getXMLReader();
      setParserProperty(reader, MAX_GENERAL_ENTITY_SIZE_LIMIT, ENTITY_SIZE_LIMIT);
      setParserProperty(reader, TOTAL_ENTITY_SIZE_LIMIT, ENTITY_SIZE_LIMIT);
      return reader;
    } catch (ParserConfigurationException | SAXException ex) {
      throw new JAXBException("Error configuring SAX parser for TEI unmarshalling", ex);
    }
  }

  /**
   * Sets a JAXP property defensively: different parser implementations may not recognise every
   * limit property, in which case the call must not break unmarshalling.
   */
  private static void setParserProperty(XMLReader reader, String property, String value) {
    try {
      reader.setProperty(property, value);
    } catch (SAXNotRecognizedException | SAXNotSupportedException ex) {
      logger.log(Level.FINE, "XML parser does not support property {0}", property);
    }
  }

  public static String marshal(TEI tei) throws JAXBException {
    return marshal(tei, false);
  }

  public static String marshal(TEI tei, boolean format) throws JAXBException {
    Marshaller marshaller = createMarshaller(format);
    StringWriter sw = new StringWriter();
    marshaller.marshal(tei, sw);
    return PATTERN_WHITESPACE_NORMALIZE.matcher(sw.toString()).replaceAll(REPLACEMENT);
  }

  private static Marshaller createMarshaller(boolean format) throws JAXBException {
    Marshaller marshaller = teiJaxbContext.createMarshaller();
    marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new TEINamespaceMapper());
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);
    return marshaller;
  }

  public static String marshal(TeiCorpus teiCorpus) throws JAXBException {
    return marshal(teiCorpus, false);
  }

  public static String marshal(TeiCorpus teiCorpus, boolean format) throws JAXBException {
    Marshaller marshaller = createMarshaller(format);
    StringWriter sw = new StringWriter();
    marshaller.marshal(teiCorpus, sw);
    return PATTERN_WHITESPACE_NORMALIZE.matcher(sw.toString()).replaceAll(REPLACEMENT);
  }

  private static void getAllTEI(TeiCorpus teiCorpus, List<TEI> result) throws JAXBException {
    for (Object part : teiCorpus.getTeiCorpusesAndTEIS()) {
      if (TEI.class.isAssignableFrom(part.getClass())) {
        result.add((TEI) part);
      } else if (TeiCorpus.class.isAssignableFrom(part.getClass())) {
        getAllTEI((TeiCorpus) part, result);
      } else {
        throw new JAXBException("Unexpected type in TeiCorpus : " + part.getClass());
      }
    }
  }

}
