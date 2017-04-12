package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/mark-and-toys
public class MarkToys {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int money = in.nextInt();

    Integer[] toys = new Integer[size];

    for (int i = 0; i < size; i++) {
      toys[i] = in.nextInt();
    }
    in.close();

    Arrays.sort(toys);
    long partialSum = 0;
    int noOfToys = 0;
    for (int i = 0; i < size; i++) {
      if (partialSum + toys[i] <= money) {
        partialSum += toys[i];
        noOfToys++;
      }
      if (partialSum >= money) {
        break;
      }
    }

    in.close();
    System.out.println(noOfToys);
  }
}
