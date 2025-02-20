package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 04.06.2020.
 * @version 1.0
 */
class ActivityStreamsDokumentTypTest {

  @Test
  void testCreation() {

    ActivityStreamsDokumentTyp typ = ActivityStreamsDokumentTyp.BESCHREIBUNG;

    assertNotNull(typ);
  }

  @Test
  void testValueFrom() {
    String type = "KOD";
    String typeSmall = "kod";
    String typeFailure = "asasd";

    assertEquals(ActivityStreamsDokumentTyp.KOD, ActivityStreamsDokumentTyp.valueFrom(type));
    assertEquals(ActivityStreamsDokumentTyp.KOD, ActivityStreamsDokumentTyp.valueFrom(typeSmall));
    assertNull(ActivityStreamsDokumentTyp.valueFrom(typeFailure));
  }

  @Test
  void testToString() {

    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.KOD;

    assertEquals("KOD", activityStreamsDokumentTyp.toString());
  }

  @Test
  void testCountValues() {
    assertEquals(13, ActivityStreamsDokumentTyp.values().length);
  }

  @Test
  void testCheckForBeziehung() {
    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.BEZIEHUNG;

    assertEquals("BEZIEHUNG", activityStreamsDokumentTyp.toString());
  }

  @Test
  void testCheckForDigitalisat() {
    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.DIGITALISAT;

    assertEquals("DIGITALISAT", activityStreamsDokumentTyp.toString());
  }

  @Test
  void testCheckForKatalog() {
    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.KATALOG;

    assertEquals("KATALOG", activityStreamsDokumentTyp.toString());
  }

  @Test
  void testCheckForOntology() {
    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.ONTOLOGIE;

    assertEquals("ONTOLOGIE", activityStreamsDokumentTyp.toString());

    assertEquals(ActivityStreamsDokumentTyp.ONTOLOGIE, ActivityStreamsDokumentTyp.valueFrom("Ontologie"));
    assertEquals(ActivityStreamsDokumentTyp.ONTOLOGIE, ActivityStreamsDokumentTyp.valueFrom("ontologie"));
    assertEquals(ActivityStreamsDokumentTyp.ONTOLOGIE, ActivityStreamsDokumentTyp.valueFrom("onTologie"));
    assertEquals(ActivityStreamsDokumentTyp.ONTOLOGIE, ActivityStreamsDokumentTyp.valueFrom("ONTOLOGIE"));
  }
}
