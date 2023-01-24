package com.algorithms.searching;

public class MajorityNumber {
  
  
  // Find majority number in an array. Majority number is the repeated more than n/2 times.
  // TC O(N) with no extra space
  public static int getMajorityNumber(int[] elements) {
   
   int i=0,j=elements.length - 1; 
   
   while (i < j) { 
     if (elements[i] == elements[j] ){
       j--;
     } else {
       elements[i] = -elements[i];
       elements[j] = -elements[j];
       i++;
       j--;
     } 
   }  

   int majority = -1;
   for (int k = 0; k < elements.length; k++) {
     if (elements[k] > 0) {
       majority = elements[k];       
     }
   }
  
   int count = 0;
   for (int k = 0; k < elements.length; k++) {
     if (elements[k] == -majority || elements[k] == majority) {
       count++;       
     }
   } 

   if (count > elements.length/2) {
     System.out.println("Majority number is : " + majority); 
     return majority;
   } else {
     System.out.println("No majority number found"); 
     return -1;
   }
  }
}
