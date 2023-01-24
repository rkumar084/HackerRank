package com.algorithms.searching;

public class Repeating {
  
  //Find 2 repeating nos in n+2 nos of range 1 to n.       
  public static void printTwoRepeatingNumbers (int[] numbers) {
    
    if (numbers.length < 4){
      return;
    }
    
    // n defines the range of numbers 1 to n
    int n = numbers.length - 2;
    
    // Find the xor of all elements of array and first n natural numbers. n = size of array
    int xor_all_and_natural_numbers = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      xor_all_and_natural_numbers ^= numbers[i];
    }    
    for (int i = 1; i <= n; i++) {
      xor_all_and_natural_numbers ^= numbers[i];    
    }
    
    // Get the poistion of first bit set in xor_all_and_natural_numbers and rest all set to 0.
    int first_bit_set = xor_all_and_natural_numbers & ~(xor_all_and_natural_numbers -1);
    
    int x=0, y=0;
    
    for (int i = 0; i < numbers.length; i++) {
      if ((first_bit_set & numbers[i]) == 0) {
          x ^= numbers[i];  
      } else {
          y ^= numbers[i]; 
      }
    }    
    for (int i = 1; i <= n; i++) {
      if ((first_bit_set & numbers[i]) == 0) {
        x ^= i;
      } else {
        y ^= i;
      }
    }
    System.out.println("Repeated two numbers are:" + x + ", " + y);
  }
  
  //Given an array in which all numbers except two are repeated once. 
  //(i.e. we have 2n+2 numbers and n numbers are occurring twice and 
  //remaining two have occurred once). Find those two numbers in the most efficient way.
  //Find 2 repeating nos in n+2 nos of range 1 to n.       
  public static void printTwoNonRepeatingNumbers (int[] numbers) {
    
    if (numbers.length < 2){
      return;
    }
    
    // Find the xor of all elements of array.
    int xor_all_numbers = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      xor_all_numbers ^= numbers[i];
    }    
    
    // Get the position of first bit set in xor_all_and_natural_numbers and rest all set to 0.
    int first_bit_set = xor_all_numbers & ~(xor_all_numbers -1);
    
    int x=0;
    int y=0;
    
    for (int i = 0; i < numbers.length; i++) {
      if ((first_bit_set & numbers[i]) == 0) {
          x ^= numbers[i];  
      } else {
          y ^= numbers[i]; 
      }
    }    
    System.out.println("Non repeated two numbers are:" + x + ", " + y);
  }  
  
}
