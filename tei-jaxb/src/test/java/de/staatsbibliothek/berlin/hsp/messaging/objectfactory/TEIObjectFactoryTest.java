package de.staatsbibliothek.berlin.hsp.messaging.objectfactory;

import static de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory.logger;
import static de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory.marshal;
import static de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory.unmarshal;
import static de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory.unmarshalOne;
import static java.nio.file.Files.newInputStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.xmlunit.matchers.CompareMatcher.isSimilarTo;

import jakarta.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.Title;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.ElementSelectors;

/**
 * @author pc
 * @since 31.03.20
 */
class TEIObjectFactoryTest {

  public static final DefaultNodeMatcher NODE_MATCHER = new DefaultNodeMatcher(
      ElementSelectors.byNameAndAllAttributes);

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

    assertEquals(1, tei.size());

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

    tei.ifPresentOrElse(teiElement -> {
      assertEquals(1, teiElement.getTeiHeader().getFileDesc().getTitleStmt().getTitles().size());
      assertEquals(
          "Beschreibung von Cod. Guelf. 36.23 Aug. 2° (Die illuminierten Handschriften der Herzog August Bibliothek. Teil 1: 6. bis 12. Jahrhundert, beschrieben von Stefanie Westphal (in Bearbeitung))",
          teiElement.getTeiHeader().getFileDesc().getTitleStmt().getTitles().get(0).getContent()
              .get(0));
    }, () -> assertTrue(false, "Test failure"));
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
  void testUnmarshalMarshal(@TempDir Path tempDirectory) throws IOException, JAXBException {

    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");

    try (InputStream is = newInputStream(teiFilePath)) {
      String marshal = marshal(unmarshal(is).get(0));
      Path xmlFile = tempDirectory.resolve("test.xml");
      Files.writeString(xmlFile, marshal);
      compareXMLFiles(xmlFile,teiFilePath);
    }

  }

  private void compareXMLFiles(Path generated, Path source) throws IOException {
    String gen = generated.toString();
    String org = source.toString();
    try (ReadableByteChannel sourceChannel = FileChannel.open(source, StandardOpenOption.READ);
        ReadableByteChannel generatedChannel = FileChannel.open(generated, StandardOpenOption.READ)) {
      assertThat("TEI2HSP for: " + gen, Input.from(sourceChannel), isSimilarTo(Input.from(generatedChannel))
          .ignoreWhitespace()
          .normalizeWhitespace()
          .ignoreComments()
          .ignoreElementContentWhitespace()
          .withNodeMatcher(NODE_MATCHER));
    }
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
