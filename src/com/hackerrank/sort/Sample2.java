package com.hackerrank.sort;

import java.util.Scanner;

public class Sample2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      numbers[i] = in.nextInt();
    }
    in.close();

    StringBuilder output = new StringBuilder();
    boolean first = true;
    for (int i = size - 1; i >= 0; i--) {

      if (first) {
        first = false;
      } else {
        output.append(" ");
      }
      output.append(numbers[i]);
    }
    System.out.println(output.toString());
  }
}
