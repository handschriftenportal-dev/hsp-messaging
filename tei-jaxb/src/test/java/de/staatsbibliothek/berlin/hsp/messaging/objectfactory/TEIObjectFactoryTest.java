/*
 * MIT License
 *
 * Copyright (c) 2023 Staatsbibliothek zu Berlin - Preußischer Kulturbesitz
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
 *
 */

package de.staatsbibliothek.berlin.hsp.messaging.objectfactory;

import static de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory.*;
import static de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory.marshal;
import static java.nio.file.Files.newInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.Title;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Diff;

/**
 * @author pc
 * @since 31.03.20
 */
class TEIObjectFactoryTest {

  @Test
  void testUnmarshal() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> allTei = unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(1, allTei.size());
    TEI tei = allTei.get(0);
    List<Title> titles = tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles();
    assertEquals(1, titles.size());
    String title = titles.get(0).getContent().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" ", "", ""));
    assertNotNull(title);
    assertFalse(title.isEmpty());
  }

  @Test
  void testUnmarshalTEI() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> tei = unmarshal(newInputStream(teiFilePath));

    assertTrue(tei.size() == 1);

    List<Title> titles = tei.get(0).getTeiHeader().getFileDesc().getTitleStmt().getTitles();
    assertEquals(1, titles.size());
    String title = titles.get(0).getContent().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" ", "", ""));
    assertNotNull(title);
    assertEquals(
        "Beschreibung von Cod. Guelf. 36.23 Aug. 2° (Die illuminierten Handschriften der Herzog August Bibliothek. Teil 1: 6. bis 12. Jahrhundert, beschrieben von Stefanie Westphal (in Bearbeitung))",
        title);


  }

  @Test
  void testUnmarshalOneTEI() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    Optional<TEI> tei = unmarshalOne(newInputStream(teiFilePath));

    assertTrue(tei.isPresent());

    tei.ifPresentOrElse(teiElement-> {
      assertEquals(1,teiElement.getTeiHeader().getFileDesc().getTitleStmt().getTitles().size());
      assertEquals(
          "Beschreibung von Cod. Guelf. 36.23 Aug. 2° (Die illuminierten Handschriften der Herzog August Bibliothek. Teil 1: 6. bis 12. Jahrhundert, beschrieben von Stefanie Westphal (in Bearbeitung))",
          teiElement.getTeiHeader().getFileDesc().getTitleStmt().getTitles().get(0).getContent().get(0));
    },()-> assertTrue(false,"Test failure"));
  }

  @Test
  void testUnmarshalCorpus() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "Berlin_test.xml");
    List<TEI> allTei = unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(12, allTei.size());
    TEI tei = allTei.get(0);
    List<Title> titles = tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles();
    assertEquals(1, titles.size());
    String title = titles.get(0).getContent().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" ", "", ""));
    assertNotNull(title);
    assertFalse(title.isEmpty());
  }

  @Test
  void testMarshal() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> allTei = unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(1, allTei.size());
    TEI tei = allTei.get(0);
    assertEquals(1, tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles().size());

    String teiAsXML = marshal(tei);
    assertNotNull(teiAsXML);
    assertTrue(teiAsXML.startsWith("<?xml version=\"1.0\""));
  }

  @Test
  void testUnmarshalMarshal() throws IOException, JAXBException {

    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal_Equals.xml");

    assertEquals(Files.readString(teiFilePath, StandardCharsets.UTF_8).replaceAll("\\s+", ""),
        marshal(unmarshal(newInputStream(teiFilePath)).get(0))
            .replaceAll("\\s+", ""));
  }

  @Test
  void testUnmarshalMarshallForEmptyLines() throws IOException, JAXBException {

    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "amberg.tei.xml");
    TEI tei = unmarshal(newInputStream(teiFilePath)).get(0);
    String xml = marshal(tei);
    Diff d = DiffBuilder.compare(Input.fromFile("src/test/resources/tei/amberg.tei.xml"))
        .withTest(xml)
        .build();

    assertFalse(d.hasDifferences(), xml);
  }
}
