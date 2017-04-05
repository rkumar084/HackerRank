package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

// Given an array of  integers, can you find the sum of its elements.
public class ArraySum {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    //int[] arr = new int[size];

    long sum = 0;

    for (int i = 0; i < size; i++) {
      sum = sum + in.nextInt();
    }
    in.close();
    System.out.println(sum);
  }
}
