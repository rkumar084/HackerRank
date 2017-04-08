package com.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/cavity-map
public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] grid = new int[n][n];
        
        for(int i=0; i < n; i++){
        	String s = new BigInteger(in.nextLine()).toString();
        	char[] digits = s.toCharArray();
        	for(int j = 0; j < digits.length ; j++) { 
        			grid[i][j] = digits[j];
        	}
        }
        
        in.close();
        
        for(int i=0; i < n ; i++){
        	StringBuilder row = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if ( i == 0 || i == n-1 || j ==0 || j== n-1) {
					row.append((char)grid[i][j]);
					continue;
				}
				if (grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i + 1][j]
						&& grid[i][j] > grid[i][j - 1]
						&& grid[i][j] > grid[i][j + 1]) {
					row.append('X');
				} else {
					row.append((char)grid[i][j]);
				}
			}
			System.out.println(row);
        }
    }	
}
