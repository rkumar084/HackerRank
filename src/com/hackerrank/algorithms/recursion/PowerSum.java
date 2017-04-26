package com.hackerrank.algorithms.recursion;

public class PowerSum {

  public static void main(String[] args) {

    char[] characters = new char[5];
    characters[0] = 'a';
    characters[1] = 'b';
    characters[2] = 'c';
    characters[3] = 'd';
    characters[4] = 'e';

    int toChoose = 3;
    combination(characters, toChoose, 0, characters.length - 1, "");
  }

  private static void combination(
      char[] characters, int toChoose, int start, int end, String prefix) {

    if (characters == null) {
      return;
    }

    if (toChoose > characters.length || toChoose < 0) {
      return;
    }

    if (toChoose == 0) {
      System.out.println(prefix);
      return;
    }

    for (int i = start; i <= end; i++) {
      combination(characters, toChoose - 1, i + 1, end, prefix + characters[i]);
    }
  }
}
