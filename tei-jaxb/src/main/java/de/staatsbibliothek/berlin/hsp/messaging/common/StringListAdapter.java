package de.staatsbibliothek.berlin.hsp.messaging.common;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 15.05.24.
 * @version 1.0
 */

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Arrays;
import java.util.List;

public class StringListAdapter extends XmlAdapter<String, List<String>> {

  @Override
  public List<String> unmarshal(String v) throws Exception {
    if (v == null || v.isEmpty()) {
      return null;
    }
    return Arrays.asList(v.split(" "));
  }

  @Override
  public String marshal(List<String> v) throws Exception {
    if (v == null || v.isEmpty()) {
      return null;
    }
    return String.join(" ", v);
  }
}

