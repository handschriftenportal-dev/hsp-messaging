package de.staatsbibliothek.berlin.hsp.messaging.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 15.05.24.
 * @version 1.0
 */
public class StringListAdapterTest {

  @Test
  void testMarshalling() throws Exception {

    StringListAdapter adapter = new StringListAdapter();

    assertNull(adapter.marshal(List.of()));

    List<String> roles = List.of("author");

    assertEquals("author", adapter.marshal(roles));
  }

  @Test
  void testUnmarshalling() throws Exception {
    StringListAdapter adapter = new StringListAdapter();

    assertNull(adapter.unmarshal(null));

    ArrayList<String> roles = new ArrayList<>();
    roles.add("author");

    assertEquals(roles, adapter.unmarshal("author"));
  }
}
