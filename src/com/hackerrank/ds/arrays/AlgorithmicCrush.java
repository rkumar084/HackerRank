package com.hackerrank.ds.arrays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/crush
public class AlgorithmicCrush {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int size = in.nextInt();
    long t = in.nextInt();

    long[] input = new long[size + 1];

    int a, b, k;
    for (int i = 0; i < t; i++) {
      a = in.nextInt();
      b = in.nextInt();
      k = in.nextInt();

      input[a] = input[a] + k;
      if (b + 1 <= size ) input[b + 1] = input[b + 1] - k;
    }
    in.close();

    long maxValue = 0;

    for (int i = 1; i <= size ; i++) {
      if (input[i] > maxValue) {
        maxValue += input[i];
      }
    }
    System.out.println(maxValue);
  }
}
