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
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.TeiCorpus;

/**
 * @author pc
 * @since 31.03.20
 */
public class TEIObjectFactory {

  public static final String NORMALIZE_REGEX = "\\s+\\n";
  public static final String REPLACEMENT = "\n";

  public static final Logger logger = Logger.getLogger(TEIObjectFactory.class.getName());
  public static JAXBContext TEI_JAXB_CONTEXT;

  static {
    try {
      TEI_JAXB_CONTEXT = JAXBContext.newInstance(TEI.class, TeiCorpus.class);
    } catch (JAXBException jaxbEx) {
      logger.log(Level.FINE, "Error creating JAXBContext", jaxbEx);
      TEI_JAXB_CONTEXT = null;
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
    Unmarshaller jaxbUnmarshaller = TEI_JAXB_CONTEXT.createUnmarshaller();
    Object jaxbResult = jaxbUnmarshaller.unmarshal(inputStream);
    return jaxbResult;
  }

  public static String marshal(TEI tei) throws JAXBException {
    return marshal(tei, false);
  }

  public static String marshal(TEI tei, boolean format) throws JAXBException {
    Marshaller marshaller = createMarshaller(format);
    StringWriter sw = new StringWriter();
    marshaller.marshal(tei, sw);
    return sw.toString().replaceAll(NORMALIZE_REGEX, REPLACEMENT);
  }

  private static Marshaller createMarshaller(boolean format) throws JAXBException {
    Marshaller marshaller = TEI_JAXB_CONTEXT.createMarshaller();
    marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new TEINamespaceMapper());
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);
    return marshaller;
  }

  public static String marshal(TeiCorpus teiCorpus) throws JAXBException {
    Marshaller marshaller = createMarshaller(true);
    StringWriter sw = new StringWriter();
    marshaller.marshal(teiCorpus, sw);
    return sw.toString().replaceAll(NORMALIZE_REGEX, REPLACEMENT);
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
