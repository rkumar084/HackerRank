package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/*HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
*/
public class GradingStudents {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }
    in.close();

    for (int i = 0; i < size; i++) {
      int grade = arr[i];
      if (grade >= 38) {
        int factor = grade / 5;
        if ((factor + 1) * 5 - grade < 3) {
          grade = (factor + 1) * 5;
        }
      }
      System.out.println(grade);
    }
  }
}
