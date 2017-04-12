package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/two-arrays
public class PermutingTwoArrays {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    String[] results = new String[t];
    for (int i = 0; i < t; i++) {
      int size = in.nextInt();
      int k = in.nextInt();
      int[] a = new int[size];
      int[] b = new int[size];

      for (int j = 0; j < size; j++) {
        a[j] = in.nextInt();
      }

      for (int j = 0; j < size; j++) {
        b[j] = in.nextInt();
      }

      results[i] = permutationPossible(a, b, k);
    }
    in.close();

    for (int i = 0; i < t; i++) {
      System.out.println(results[i]);
    }
  }

  private static String permutationPossible(int[] a, int[] b, int k) {
    String result = "YES";
    Arrays.sort(a);
    Arrays.sort(b);
    int len = a.length;

    for (int i = 0; i < len; i++) {
      
      if (!((a[i] + b[len - i -1]) >= k)) {
        result = "NO";
      }
    }
    return result;
  }
}
