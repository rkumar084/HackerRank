package com.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

// Given an array of large integers, can you find the sum of its elements.
public class ArraySum {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    //int[] arr = new int[size];

    BigInteger sum = BigInteger.ZERO;

    for (int i = 0; i < size; i++) {
      sum = sum.add(in.nextBigInteger());
    }
    in.close();
    System.out.println(sum);
  }
}
