package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

// Given a time in -hour AM/PM format, convert it to military (-hour) time.
public class TimeConversion {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String time = in.nextLine();

    if ("12:00:00AM".equals(time)) {
      System.out.println("00:00:00");
      return;
    }

    if ("12:00:00PM".equals(time)) {
      System.out.println("12:00:00");
      return;
    }

    String[] timeArr = time.split(":");
    int hours = Integer.parseInt(timeArr[0]);
    int minutes = Integer.parseInt(timeArr[1]);
    int seconds = Integer.parseInt(timeArr[2].substring(0, 2));
    boolean isAm = false;
    if ("am".equalsIgnoreCase(timeArr[2].substring(2, 4))) {
      isAm = true;
    }

    if (!isAm) {
      if (hours != 12)
        hours += 12;
    } else {
      if (hours == 12)
        hours = 0;
    }
    System.out.println(
        String.format("%02d", hours)
            + ":"
            + String.format("%02d", minutes)
            + ":"
            + String.format("%02d", seconds));
  }
}
