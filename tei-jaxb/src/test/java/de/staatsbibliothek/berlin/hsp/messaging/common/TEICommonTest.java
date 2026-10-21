package de.staatsbibliothek.berlin.hsp.messaging.common;

import static java.nio.file.Files.newInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.tei_c.ns._1.Additional;
import org.tei_c.ns._1.Bibl;
import org.tei_c.ns._1.History;
import org.tei_c.ns._1.Idno;
import org.tei_c.ns._1.MsDesc;
import org.tei_c.ns._1.MsPart;
import org.tei_c.ns._1.Settlement;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.TeiCorpus;
import org.tei_c.ns._1.TeiHeader;
import org.tei_c.ns._1.Title;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 12.05.2020.
 * @version 1.0
 */


class TEICommonTest {

  @Test
  void testfindAll() throws Exception {

    Path teiFilePath = Paths
        .get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    try (InputStream inputStream = newInputStream(teiFilePath)) {

      List<TEI> tei = TEIObjectFactory.unmarshal(inputStream);
      List<MsDesc> msDescList = new ArrayList<>();
      List<Additional> additionalList = new ArrayList<>();
      List<Bibl> biblList = new ArrayList<>();

      // Exceptions must fail the test, not be swallowed: findAll declares throws Exception.
      TEICommon.findAll(MsDesc.class, tei.getFirst(), msDescList);

      assertEquals(1, msDescList.size());

      TEICommon.findAll(Additional.class,
          msDescList.getFirst().getMsContentsAndPhysDescsAndHistories(), additionalList);
      TEICommon.findAll(Bibl.class, additionalList, biblList);

      assertEquals(30, biblList.size());
    }
  }

  @Test
  void testFindOne()
      throws Exception {
    Path teiFilePath = Paths
        .get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");

    try (InputStream inputStream = newInputStream(teiFilePath)) {

      List<TEI> tei = TEIObjectFactory.unmarshal(inputStream);

      assertTrue(TEICommon.findFirst(MsDesc.class, tei.getFirst()).isPresent());

      assertTrue(TEICommon.findFirst(TeiHeader.class, tei.getFirst()).isPresent());

      assertTrue(TEICommon.findFirst(History.class, tei.getFirst()).isPresent());

      assertFalse(TEICommon.findFirst(TeiCorpus.class, tei.getFirst()).isPresent());
    }
  }

  /**
   * findFirst must stop at the first match instead of scanning the whole tree (the import path runs
   * this across ~80k documents). Proven structurally: a sibling that explodes when traversed is
   * placed right after the first match — findFirst must never reach it, whereas findAll does.
   */
  @Test
  void findFirstStopsAtFirstMatch() throws Exception {
    Idno match = new Idno();
    Iterable<Object> explodingSibling = () -> {
      throw new IllegalStateException("traversed past the first match");
    };
    List<Object> root = new ArrayList<>();
    root.add(match);
    root.add(explodingSibling);

    var first = TEICommon.findFirst(Idno.class, root);
    assertTrue(first.isPresent());
    assertSame(match, first.get(), "findFirst must return the first match");

    assertThrows(IllegalStateException.class,
        () -> TEICommon.findAll(Idno.class, root, new ArrayList<>()),
        "findAll must traverse the whole tree, including the sibling after the first match");
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

  @Test
  void testFindAllWholeTreeCountsWestphal() throws Exception {
    TEI tei = loadSingle("tei-msDesc_Westphal.xml");
    assertEquals(1, count(MsDesc.class, tei));
    assertEquals(1, count(Additional.class, tei));
    assertEquals(382, count(Bibl.class, tei));
    assertEquals(1, count(History.class, tei));
    assertEquals(1, count(TeiHeader.class, tei));
    assertEquals(2, count(MsPart.class, tei));
    assertEquals(4, count(Idno.class, tei));
    assertEquals(50, count(Title.class, tei));
    assertEquals(1, count(Settlement.class, tei));
  }

  @Test
  void testFindAllWholeTreeCountsContentTest() throws Exception {
    TEI tei = loadSingle("contentTest.xml");
    assertEquals(1, count(MsDesc.class, tei));
    assertEquals(1, count(Additional.class, tei));
    assertEquals(1, count(Bibl.class, tei));
    assertEquals(1, count(History.class, tei));
    assertEquals(1, count(TeiHeader.class, tei));
    assertEquals(0, count(MsPart.class, tei));
    assertEquals(4, count(Idno.class, tei));
    assertEquals(7, count(Title.class, tei));
    assertEquals(1, count(Settlement.class, tei));
  }

  /**
   * findFirst must return the same instance findAll yields first — i.e., findFirst agrees with
   * findAll's traversal rather than taking a divergent path. (Full traversal-order stability is
   * covered by {@link #traversalOrderStableAcrossCacheRebuild}.)
   */
  @ParameterizedTest
  @ValueSource(classes = {MsDesc.class, Title.class, Bibl.class, Idno.class})
  <T> void testFindFirstReturnsFirstMatchOfFindAll(Class<T> type) throws Exception {
    TEI tei = loadSingle("tei-msDesc_Westphal.xml");
    List<T> all = new ArrayList<>();
    TEICommon.findAll(type, tei, all);
    assertFalse(all.isEmpty(), "expected at least one " + type.getSimpleName());

    T first = TEICommon.findFirst(type, tei).orElse(null);
    assertSame(all.getFirst(), first,
        "findFirst must return the first element findAll yields for " + type.getSimpleName());
  }

  /**
   * The traversal order findFirst relies on must be deterministic and independent of cache state:
   * rebuilding the per-class child-property plan from scratch must yield the identical ordered
   * result. Guards against a non-ordered collector, parallel stream, or HashMap creeping into
   * buildChildProperties. (getMethods() order is stable within a single JVM run.)
   */
  @ParameterizedTest
  @ValueSource(classes = {MsDesc.class, Title.class, Bibl.class, Idno.class})
  <T> void traversalOrderStableAcrossCacheRebuild(Class<T> type) throws Exception {
    TEI tei = loadSingle("tei-msDesc_Westphal.xml");

    List<T> firstRun = new ArrayList<>();
    TEICommon.findAll(type, tei, firstRun);
    assertFalse(firstRun.isEmpty(), "expected at least one " + type.getSimpleName());

    clearChildPropertiesCache();   // force a fresh plan build on the next traversal

    List<T> secondRun = new ArrayList<>();
    TEICommon.findAll(type, tei, secondRun);

    assertEquals(firstRun, secondRun,
        "findAll order must survive a cache rebuild for " + type.getSimpleName());
  }

  /**
   * Exercises the isSet-guard branch with guards returning false: an empty MsDesc has all optional
   * children unset, so traversal must descend the guarded getters without error and find nothing.
   */
  @Test
  void testFindAllOnEmptyObjectHitsIsSetGuards() throws Exception {
    MsDesc empty = new MsDesc();
    assertEquals(0, count(Bibl.class, empty));
    assertEquals(0, count(Title.class, empty));
    assertTrue(TEICommon.findFirst(Bibl.class, empty).isEmpty());
  }

  /**
   * The per-class plan cache is a shared static state. Run identical traversals concurrently and
   * assert every thread agrees with the single-threaded reference, validating the parallel use case
   * the cache was introduced to support.
   */
  @Test
  void testFindAllConcurrent() throws Exception {
    TEI tei = loadSingle("tei-msDesc_Westphal.xml");
    int expectedBibl = count(Bibl.class, tei);
    int expectedTitle = count(Title.class, tei);

    int threads = 8;
    int iterationsPerThread = 50;
    try (ExecutorService pool = Executors.newFixedThreadPool(threads)) {
      List<Callable<Boolean>> tasks = new ArrayList<>();
      for (int i = 0; i < threads; i++) {
        tasks.add(() -> {
          for (int n = 0; n < iterationsPerThread; n++) {
            if (count(Bibl.class, tei) != expectedBibl
                || count(Title.class, tei) != expectedTitle) {
              return false;
            }
          }
          return true;
        });
      }
      for (Future<Boolean> f : pool.invokeAll(tasks)) {
        assertTrue(f.get(), "concurrent findAll produced a count divergent from the reference");
      }
    }
  }

  private static TEI loadSingle(String fileName) throws Exception {
    try (InputStream in = newInputStream(
        Paths.get("src", "test", "resources", "tei", fileName))) {
      List<TEI> teis = TEIObjectFactory.unmarshal(in);
      assertEquals(1, teis.size(), "test fixture " + fileName + " must contain exactly one TEI");
      return teis.getFirst();
    }
  }

  private static <T> int count(Class<T> type, Object root) throws Exception {
    List<T> result = new ArrayList<>();
    TEICommon.findAll(type, root, result);
    return result.size();
  }

  /**
   * Clears TEICommon's private static child-property cache via reflection, so the next traversal
   * rebuilds each class's plan from scratch. Kept here (not as a production method) to avoid adding
   * test-only API to TEICommon; the field name is a string, so update it here if the field is
   * renamed.
   */
  private static void clearChildPropertiesCache() throws ReflectiveOperationException {
    Field cacheField = TEICommon.class.getDeclaredField("CHILD_PROPERTIES_CACHE");
    cacheField.setAccessible(true);
    ((Map<?, ?>) cacheField.get(null)).clear();
  }

  private List<Title> getTitleFromMsDesc(MsDesc msDesc) {
    List<Title> allTitles = new ArrayList<>();

    if (Objects.nonNull(msDesc)) {
      allTitles.addAll(msDesc.getHeads().stream().flatMap(head -> head.getContent().stream())
          .filter(Title.class::isInstance)
          .map(o -> (Title) o)
          .toList());

      allTitles.addAll(
          msDesc.getMsContentsAndPhysDescsAndHistories().stream()
              .filter(MsPart.class::isInstance)
              .map(MsPart.class::cast)
              .flatMap(p -> p.getHeads().stream())
              .flatMap(head -> head.getContent().stream())
              .filter(Title.class::isInstance)
              .map(Title.class::cast)
              .toList());
    }
    return allTitles;
  }

}
