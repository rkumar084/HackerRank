package com.hackerrank.combinatorics;

import java.util.Scanner;

/***********
A strange grid has been recovered from an old book. It has 5 columns and infinite number of rows. 
The bottom row is considered as the first row. First few rows of the grid are like this:

..............

..............

20 22 24 26 28

11 13 15 17 19

10 12 14 16 18

 1  3  5  7  9

 0  2  4  6  8
The grid grows upwards forever!

Your task is to find the integer in cth column in rth row of the grid.

Input Format
There will be two integers r and c separated by a single space.

Constraints
1≤r≤2 * 109

1≤c≤5

Rows are indexed from bottom to top and columns are indexed from left to right.

Output Format

Output the answer in a single line.

Sample Input

6 3
Sample Output

25
Explanation

The number in the 6th row and 3rd column is 25.
 
******************/
public class StrangeGrid {
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        String inputLine = in.nextLine();
        String[] inputElements = inputLine.split(" ");
        Long row  = Long.parseLong(inputElements[0]); 
        int col  = Integer.parseInt(inputElements[1]); 

        Long[] rowElements = new Long[5];
        
        Long startNumber = Long.parseLong(row / 2+"");
        startNumber = startNumber * 10;
        if (row % 2 == 0){
        	rowElements[0] = startNumber - 9;
        	rowElements[1] = startNumber - 7;
        	rowElements[2] = startNumber - 5;
        	rowElements[3] = startNumber - 3;
        	rowElements[4] = startNumber - 1;
        	
        }else{
        	rowElements[0] = startNumber ;
        	rowElements[1] = startNumber +2;
        	rowElements[2] = startNumber + 4;
        	rowElements[3] = startNumber + 6;
        	rowElements[4] = startNumber + 8;
        	
        }
        
        System.out.println(rowElements[col -1]);
        
	}

}
