package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

//Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges,
//awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

public class CompareTriplets {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Double[] scores1 = new Double[3];
    for (int i = 0; i < 3; i++) {
      scores1[i] = in.nextDouble();
    }

    Double[] scores2 = new Double[3];
    for (int i = 0; i < 3; i++) {
      scores2[i] = in.nextDouble();
    }

    int aliceScore = 0;
    int bobScore = 0;
    for (int i = 0; i < 3; i++) {
      if (scores1[i] > scores2[i]) {
        aliceScore++;
      } else if (scores1[i] < scores2[i]) {
        bobScore++;
      }
    }

    System.out.println(aliceScore + " " + bobScore);
  }
}
