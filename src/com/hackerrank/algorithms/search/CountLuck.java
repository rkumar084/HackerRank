package com.hackerrank.algorithms.search;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/count-luck
public class CountLuck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		boolean[] results = new boolean[t];
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] matrix = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				matrix[G_i] = in.next();
			}
			int k = in.nextInt();
			results[a0] = hasPath(matrix, k, 1 , 0);
		}
		in.close();
		for (int a0 = 0; a0 < t; a0++) {
			if (results[a0] == true)
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
		}
	}
	
	private static boolean hasPath(String[] matrix, Integer k, Integer direction, Integer count) {
		
		if (k==0) {
			
		}
		
		
		
		
		
		
	}

}
