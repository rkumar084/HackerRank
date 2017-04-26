package com.hackerrank.ds.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/sparse-arrays
public class SparseArrays {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = Integer.parseInt(in.nextLine());

    Map<String, Integer> strMap = new HashMap();
    for (int i = 0; i < n; i++) {
      String str = in.nextLine();
      if (strMap.containsKey(str)) {
        int count = strMap.get(str);
        strMap.put(str, count + 1);
      } else {
        strMap.put(str, 1);
      }
    }

    int q = Integer.parseInt(in.nextLine());
    int[] output = new int[q];

    for (int i = 0; i < q; i++) {
      String str = in.nextLine();
      if (strMap.containsKey(str)) {
        output[i] = strMap.get(str);
      }
    }
    in.close();

    for (int i = 0; i < q; i++) {
      System.out.println(output[i]);
    }
  }
}
