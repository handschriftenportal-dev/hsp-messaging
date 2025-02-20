package de.staatsbibliothek.berlin.hsp.messaging.common;

import static java.nio.file.Files.newInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tei_c.ns._1.Additional;
import org.tei_c.ns._1.Bibl;
import org.tei_c.ns._1.History;
import org.tei_c.ns._1.MsDesc;
import org.tei_c.ns._1.MsPart;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.TeiCorpus;
import org.tei_c.ns._1.TeiHeader;
import org.tei_c.ns._1.Title;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 12.05.2020.
 * @version 1.0
 */


public class TEICommonTest {

  private static final Logger logger = LoggerFactory.getLogger(TEICommonTest.class);

  @Test
  void testfindAll() throws IOException, JAXBException {

    Path teiFilePath = Paths
        .get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    try (InputStream inputStream = newInputStream(teiFilePath)) {

      List<TEI> tei = TEIObjectFactory.unmarshal(inputStream);
      List<MsDesc> msDescList = new ArrayList<>();
      List<Additional> additionalList = new ArrayList<>();
      List<Bibl> biblList = new ArrayList<>();

      try {

        TEICommon.findAll(MsDesc.class, tei.get(0), msDescList);

        assertEquals(1, msDescList.size());

        TEICommon.findAll(Additional.class,
            msDescList.get(0).getMsContentsAndPhysDescsAndHistories(), additionalList);
        TEICommon.findAll(Bibl.class, additionalList, biblList);

        assertEquals(30, biblList.size());

      } catch (Exception e) {
        logger.error("Error during Testing FinAll", e);
      }
    }
  }

  @Test
  void testFindOne()
      throws Exception {
    Path teiFilePath = Paths
        .get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");

    try (InputStream inputStream = newInputStream(teiFilePath)) {

      List<TEI> tei = TEIObjectFactory.unmarshal(inputStream);

      assertTrue(TEICommon.findFirst(MsDesc.class, tei.get(0)).isPresent());

      assertTrue(TEICommon.findFirst(TeiHeader.class, tei.get(0)).isPresent());

      assertTrue(TEICommon.findFirst(History.class, tei.get(0)).isPresent());

      assertFalse(TEICommon.findFirst(TeiCorpus.class, tei.get(0)).isPresent());
    }
  }

  @Test
  void getContentAsString() throws Exception {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "contentTest.xml");
    List<TEI> teis = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
    List<MsDesc> msDescList = new ArrayList<>();
    List<Title> allTitles = new ArrayList<>();
    for (TEI tei : teis) {
      msDescList.clear();
      TEICommon.findAll(MsDesc.class, tei, msDescList);
      for (MsDesc msDesc : msDescList) {
        allTitles = getTitleFromMsDesc(msDesc);
      }
    }
    String titleAsString = TEICommon.getContentAsString(allTitles);
    assertEquals("Avicenne libri canonis pars I, interprete Gerardo Cremonensi .",
        Normalizer.normalize(titleAsString, Form.NFD));
  }

  private List<Title> getTitleFromMsDesc(MsDesc msDesc) {
    List<Title> allTitles = new ArrayList<>();

    if (Objects.nonNull(msDesc)) {
      allTitles.addAll(msDesc.getHeads().stream().flatMap(head -> head.getContent().stream())
          .filter(o -> o instanceof Title).map(o -> (Title) o).toList());

      allTitles.addAll(
          msDesc.getMsContentsAndPhysDescsAndHistories().stream()
              .filter(o -> o instanceof MsPart)
              .flatMap(p -> ((MsPart) p).getHeads().stream())
              .flatMap(head -> head.getContent().stream())
              .filter(o -> o instanceof Title).map(o -> (Title) o).toList());
    }
    return allTitles;
  }

}
