package com.hackerrank.ds.arrays;

import java.util.Scanner;

public class ArrayRotation {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();
    int rotations = in.nextInt();

    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }
    in.close();

    boolean first = true;
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < size; i++) {
      if (first) {
        first = false;
      } else {
        output.append(" ");
      }
      output.append(arr[(i + rotations) % size]);
    }
    System.out.println(output);
  }
}
