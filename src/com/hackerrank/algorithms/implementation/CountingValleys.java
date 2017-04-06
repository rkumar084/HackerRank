package com.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/*Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details 
like topography. During his last hike, he took exactly n steps. For every step he took, he noted 
if it was an uphill or a downhill step. Gary's hikes start and end at sea level. We define the following terms:

- A mountain is a non-empty sequence of consecutive steps above sea level, starting with a step up from sea level and 
  ending with a step down to sea level.

- A valley is a non-empty sequence of consecutive steps below sea level, starting with 
  a step down from sea level and ending with a step up to sea level. 
  
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
*/
public class CountingValleys {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = Integer.parseInt(in.nextLine());

    String stepsStr = in.nextLine();
    char[] stepsArr = stepsStr.toCharArray();

    int valleyCount = 0;
    int level = 0;
    for (int i = 0; i < size; i++) {
      
      if (stepsArr[i] == 'U') {
        if (level == -1) {
          valleyCount++;
        }
        level++;
      } else {
        level--;
      }
    }
    System.out.println(valleyCount); 
  }
}
