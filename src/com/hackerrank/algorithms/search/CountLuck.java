package com.hackerrank.algorithms.search;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/count-luck
public class CountLuck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		boolean[] results = new boolean[t];
		Stack<String> stack = new Stack<>();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] matrix = new String[R];
			int i = 0, j = 0;
			for (int G_i = 0; G_i < R; G_i++) {
				matrix[G_i] = in.next();
				int index = matrix[G_i].indexOf('M');
				if (index != -1) {
					i = G_i;
					j = index;
				}
			}
			int k = in.nextInt();

			results[a0] = hasPath(matrix, k, stack);
		}
		in.close();
		for (int a0 = 0; a0 < t; a0++) {
			if (results[a0] == true)
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
		}
	}

	// 1-left, 2-right 3-up, 4- down
	private static boolean hasPath(String[] matrix, Integer k, Stack stack) {

		return false;

	}

}
