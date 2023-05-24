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
import java.util.stream.Collectors;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.tei_c.ns._1.Bibl;
import org.tei_c.ns._1.History;
import org.tei_c.ns._1.MsDesc;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.TeiCorpus;
import org.tei_c.ns._1.TeiHeader;
import org.tei_c.ns._1.Title;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 12.05.2020.
 * @version 1.0
 */
public class TEICommonTest {

  @Test
  void testfindAll() throws IOException, JAXBException {

    Path teiFilePath = Paths
        .get("src", "test", "resources", "tei", "tei-msDesc_Westphal_Equals.xml");
    try (InputStream inputStream = newInputStream(teiFilePath)) {

      List<TEI> tei = TEIObjectFactory.unmarshal(inputStream);
      List<MsDesc> msDescList = new ArrayList<>();
      List<Bibl> biblList = new ArrayList<>();

      try {

        TEICommon.findAll(MsDesc.class, tei.get(0), msDescList);

        assertEquals(1, msDescList.size());

        TEICommon.findAll(Bibl.class, msDescList.get(0).getAdditional(), biblList);

        assertEquals(30, biblList.size());

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  void testFindOne()
      throws Exception {
    Path teiFilePath = Paths
        .get("src", "test", "resources", "tei", "tei-msDesc_Westphal_Equals.xml");

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
          .filter(o -> o instanceof Title).map(o -> (Title) o).collect(Collectors.toList()));

      allTitles.addAll(
          msDesc.getMsParts().stream().flatMap(p -> p.getHeads().stream())
              .flatMap(head -> head.getContent().stream())
              .filter(o -> o instanceof Title).map(o -> (Title) o).collect(Collectors.toList()));
    }
    return allTitles;
  }

}
