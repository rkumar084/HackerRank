package com.hackerrank.algorithms.greedy;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/sherlock-and-the-beast
public class SherlockNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    String[] results = new String[t];

    for (int i = 0; i < t; i++) {
      results[i] = getDecentNumber(in.nextInt());
    }
    in.close();

    for (int i = 0; i < t; i++) {
      System.out.println(results[i]);
    }
  }

  private static String getDecentNumber(int n) {

    int l = 0, r = 0;
    boolean found = false;
    for (int i = 0; i <= n; i++) {
      l = n - i;
      r = i;

      if (l % 3 == 0 && r % 5 == 0) {
        found = true;
        break;
      }
    }
    if (found) {
      StringBuilder result = new StringBuilder();
      for (int i = 1; i <= l; i++) {
        result.append('5');
      }
      for (int i = 1; i <= r; i++) {
        result.append('3');
      }
      return result.toString();
    }
    return "-1";
  }
}
