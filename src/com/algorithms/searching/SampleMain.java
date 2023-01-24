package com.algorithms.searching;

public class SampleMain {

  //  Find 2 repeating nos in n+2 nos of range 1 to n.
  //  public static void main(String[] args) {
  //    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 14};
  //    Repeating.printTwoRepeatingNumbers(arr);
  //  }

  //Given an array in which all numbers except two are repeated once.
  //(i.e. we have 2n+2 numbers and n numbers are occurring twice and
  //remaining two have occurred once). Find those two numbers in the most efficient way.
  //Find 2 repeating nos in n+2 nos of range 1 to n.
  //  public static void main(String[] args) {
  //    //int arr[] = {1,1,2,2,6,6,9,9,101,101,7,3,90,90,45,45};
  //    int arr[] = {1, 1, 2, 2, 3, 4};
  //    Repeating.printTwoNonRepeatingNumbers(arr);
  //  }

  // Find majority number.
  public static void main(String[] args) {
    //int arr[] = {5,5,5,5,5,7,7,7,7,7,7,7};
    // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9};
    int arr[] = {1, 7, 3, 7, 5, 7, 7, 9, 7, 9};
    MajorityNumber.getMajorityNumber(arr);
  }
}
