package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Scanner;

/*
 When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle. 
 In a new kind of PDF viewer, the selection of each word is independent of the other words; this means 
 that each rectangular selection area forms independently around each highlighted word. 

In this type of PDF viewer, the width of the rectangular selection area is equal to the number of letters in the 
word times the width of a letter, and the height is the maximum height of any letter in the word.

Consider a word consisting of lowercase English alphabetic letters, where each letter is  1mm wide. 
Given the height of each letter in millimeters (mm), find the total area that will be highlighted by blue 
rectangle when the given word is selected in our new PDF viewer.

Input Format

The first line contains  26 space-separated integers describing the respective heights of each consecutive lowercase English letter . 
The second line contains a single word, consisting of lowercase English alphabetic letters.
*/
public class DesignerPdfViewer {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] heights = in.nextLine().split(" ");    
    char[] word = in.nextLine().toCharArray();
    HashMap<Integer, Integer> heightMap = new HashMap<>();
    
    for (int i = 0 ; i < 26 ; i ++) {
      heightMap.put(new Integer(97 + i) , Integer.parseInt(heights[i]));
    }
    
    int area = 0;
    int maxHeight = 0;
    for(char c : word ) {
      int height = heightMap.get((int)c);
      if (maxHeight < height) {
        maxHeight = height;
      }
    }
    System.out.println(word.length*maxHeight); 
  }
}
