package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

//Consider a staircase of size :
//
//   #
//  ##
// ###
//####
public class Staircase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    char[] str = new char[size];
    in.close();
    for (int i = 0; i < size; i++) {

      for (int j = 0; j < size; j++) {
        if (j < size - 1 - i) {
          str[j] = ' ';
        } else {
          str[j] = '#';
        }
      }
      System.out.println(str); 
    }
  }
}
