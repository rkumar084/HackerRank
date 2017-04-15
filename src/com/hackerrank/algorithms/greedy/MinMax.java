package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();

		}
		in.close();
		Arrays.sort(array);

		int startIndex = 0;
		int endIndex = k - 1;

		int minDiff = Integer.MAX_VALUE;
		int i = 0;
		while(i <= n - k) {
			
			int diff = array[i + k - 1] - array[i];
			if (minDiff > diff) {
				minDiff = diff;
				startIndex = i;
				endIndex = i + k - 1;
			}
			i++;
		}
		System.out.println(array[endIndex] - array[startIndex]) ;
	}
}
