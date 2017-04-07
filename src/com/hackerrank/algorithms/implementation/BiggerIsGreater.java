package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/*Given a word , rearrange the letters of  to construct another word  in such a way
that  is lexicographically greater than . In case of multiple possible answers,
find the lexicographically smallest one among them.
*/
public class BiggerIsGreater {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = Integer.parseInt(in.nextLine());

    for (int i = 0; i < size; i++) {
      String s = in.nextLine();
      printNextBigger(s, s.length() - 2);
    }
    in.close();
  }

  public static void printNextBigger(String s, int pos) {

    if (pos < 0) {
      System.out.println("no answer");
      return;
    }
    char[] sArr = s.toCharArray();

    int greaterAlphabetPosition = -1;
    int minChar = 'z';
    for (int i = pos + 1; i < s.length(); i++) {
      if (sArr[pos] < sArr[i]) {
        if (minChar >= sArr[i]) {
          greaterAlphabetPosition = i;
          minChar = sArr[i];
        }
      }
    }

    if (greaterAlphabetPosition != -1) {
      // swap
      char temp = sArr[greaterAlphabetPosition];
      sArr[greaterAlphabetPosition] = sArr[pos];
      sArr[pos] = temp;

      Arrays.sort(sArr, pos + 1, sArr.length);
      System.out.println(sArr);
      return;
    } else {
      printNextBigger(s, pos - 1);
    }
  }
}
