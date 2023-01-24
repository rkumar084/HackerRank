package com.algorithms.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// Finding symmetric pairs in a given set of pairs.
public class SymmetricPairs {

  public static void printSymmetricPairs(Pair[] pairs) {

    if (pairs == null || pairs.length < 1) return;

    HashMap<Object, HashSet> map = new HashMap<Object, HashSet>();
    for (Pair pair : pairs) {
      if (map.containsKey(pair.getValue1())) {
        HashSet temp = map.get(pair.getValue1());

        if (temp.contains(pair.getValue2())) {
          System.out.println("== Symmetric pair found for ==");
          System.out.println(pair.toString());
        } else {
          updateMap(map, pair);
        }
      } else {
        updateMap(map, pair);
      }
    }
  }

  private static void updateMap(Map map, Pair pair) {

    if (map.containsKey(pair.getValue2())) {
      HashSet temp = (HashSet) map.get(pair.getValue2());
      temp.add(pair.getValue1());
    } else {
      HashSet temp = new HashSet();
      temp.add(pair.getValue1());
      map.put(pair.getValue2(), temp);
    }
  }
}
