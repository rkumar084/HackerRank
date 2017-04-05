package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class MinMaxSum {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Long minSum = Long.MAX_VALUE;
    Long maxSum = Long.MIN_VALUE;
    long[] arr = new long[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = in.nextLong();
    }
    in.close();

    for (int i = 0; i < 5; i++) {
      long sum = 0;
      for (int j = 0; j < 5; j++) {
        if (i != j) {
          sum += arr[j];
        }
      }
      if (minSum > sum) minSum = sum;
      if (maxSum < sum) maxSum = sum;
    }

    System.out.println(minSum + " " + maxSum);
  }
}
