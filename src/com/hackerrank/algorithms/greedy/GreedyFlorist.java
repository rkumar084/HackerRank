package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/greedy-florist
public class GreedyFlorist {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] costs = new int[n];
    for (int i = 0; i < n; i++) {
      costs[i] = in.nextInt();
    }
    in.close();
    
    Arrays.sort(costs);

    long totalCost = 0;
    int windowNumber = 0;
    for (int i = n-1 ; i >= 0;) {
      int j = 1;
      while(j<=k && i>=0) {
        totalCost += (windowNumber + 1)*costs[i];
        i--;
        j++;
      }
      windowNumber++;
    }
    
    System.out.println(totalCost ); 
  }
}
