package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/priyanka-and-toys
public class PriyankaAndToys {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] wts = new int[size];
    for (int i = 0; i < size; i++) {
      wts[i] = in.nextInt();
    }
    in.close();

    Arrays.sort(wts);

    int toyCount = 0;
    int l = 0, r = 0;

    while (r < size) {
      if (r + 1 < size && wts[r + 1] <= wts[l] + 4) {
        r++;
      } else {
        r++;
        l = r;
        toyCount++;
      }
    }

    System.out.println(toyCount);
  }
}
