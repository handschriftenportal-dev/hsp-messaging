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

package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamObjectTagId;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamsDokumentTyp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 29.05.2020.
 * @version 1.0
 */
public class HSPActivityStreamObjectTest {

  @Test
  void testCreation() throws ActivityStreamsException {

    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(true)
        .withType(ActivityStreamsDokumentTyp.KOD)
        .withUrl("http://localhost")
        .withId("1")
        .withMediaType("text/xml")
        .withGroupId("beschreibung1")
        .withContent("Test".getBytes())
        .withTag(List.of(new HSPActivityStreamObjectTag("type1", ActivityStreamObjectTagId.DEACTIVATE_HSP_FORMAT_VALIDATION, "name1"), new HSPActivityStreamObjectTag("type2", ActivityStreamObjectTagId.INTERN_EXTERN, "name2")))
        .build();

    assertEquals("1", activityStreamObject.getId());

    assertEquals("beschreibung1", activityStreamObject.getGroupId());

    assertEquals(ActivityStreamsDokumentTyp.KOD, activityStreamObject.getType());

    assertEquals("text/xml", activityStreamObject.getMediaType());

    StringBuilder tagContent = new StringBuilder();

    activityStreamObject.getTag().forEach(hspActivityStreamObjectTag -> {
      tagContent.append(hspActivityStreamObjectTag.toString());
      tagContent.append("  ");
    });

    String expectedString = "HSPActivityStreamObjectTag{type='type1', id='DEACTIVATE_HSP_FORMAT_VALIDATION', name='name1'}  HSPActivityStreamObjectTag{type='type2', id='INTERN_EXTERN', name='name2'}  ";
    String actualString = tagContent.toString();
    assertEquals(expectedString, actualString);

    assertEquals(true, activityStreamObject.isCompressed());

  }

  @Test
  void testCheckBase64Encoding() throws ActivityStreamsException, IOException {
    Path xml = Paths.get("src", "test", "resources", "amberg.tei.xml");
    String teiContent= Files.readString(xml);

    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(false)
        .withType(ActivityStreamsDokumentTyp.BESCHREIBUNG)
        .withUrl("http://localhost")
        .withId("1")
        .withMediaType("application/xml")
        .withGroupId("beschreibung1")
        .withContent(teiContent)
        .withTag(List.of(new HSPActivityStreamObjectTag("type1", ActivityStreamObjectTagId.DEACTIVATE_HSP_FORMAT_VALIDATION, "name1"), new HSPActivityStreamObjectTag("type2", ActivityStreamObjectTagId.INTERN_EXTERN, "name2")))
        .build();

    assertEquals(teiContent,new String(activityStreamObject.getContent()));
  }
}
