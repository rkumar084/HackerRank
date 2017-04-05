package com.hackerrank.algorithms.warmup;

import java.math.BigDecimal;
import java.util.Scanner;

//Given an array of integers, calculate which fraction of its elements are positive, which fraction
//of its elements are negative, and which fraction of its elements are zeroes, respectively.
//Print the decimal value of each fraction on a new line.

public class PlusMinus {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] ar = new int[size];

    for (int i = 0; i < size; i++) {
      ar[i] = in.nextInt();
    }
    in.close();

    double fraction = 0;
    double possitiveCount = 0, negativeCount = 0, zeroCount = 0;

    for (int i = 0; i < size; i++) {
      if (ar[i] < 0) {
        negativeCount++;
      } else if (ar[i] > 0) {
        possitiveCount++;
      } else {
        zeroCount++;
      }
    }
    System.out.println(String.format("%.6f", possitiveCount / size));
    System.out.println(String.format("%.6f", negativeCount / size));
    System.out.println(String.format("%.6f", zeroCount / size));
  }
}
