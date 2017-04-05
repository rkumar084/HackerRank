package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

//Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
public class DiagonalDifference {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[][] ar = new int[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        ar[i][j] = in.nextInt();
      }
    }
    in.close();

    long sum1 = 0, sum2 = 0;
    for (int i = 0; i < size; i++) {
      sum1 += ar[i][i];
      sum2 += ar[i][size - 1 - i];
    }
    System.out.println(Math.abs(sum1 - sum2));
  }
}
