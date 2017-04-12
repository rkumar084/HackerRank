package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
public class MininumAbsoluteDifference {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i<size; i ++) {
      arr[i] = in.nextInt();
    }
    in.close();
    
    Arrays.sort(arr);

     int absoluteMin = Integer.MAX_VALUE;
     
     for (int i = 0; i<size - 1; i ++) {
       int absDiff = Math.abs(arr[i] - arr[i+1]);
       if (absoluteMin > absDiff)
         absoluteMin = absDiff;
     }
    System.out.println(absoluteMin ); 
  }
}
