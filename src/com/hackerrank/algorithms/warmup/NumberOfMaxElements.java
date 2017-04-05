package com.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberOfMaxElements {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    long max = 0;
    long maxCount = 0;

    for (int i = 0; i < size; i++) {
      long number = in.nextLong();
      if (max < number) {
        max = number;
        maxCount = 1;
      } else if (max == number) {
        maxCount++;
      }
    }
    in.close();
    System.out.println(maxCount);
  }
}