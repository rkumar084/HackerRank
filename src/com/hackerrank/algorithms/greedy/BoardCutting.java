package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/board-cutting
public class BoardCutting {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		Long[] results = new Long[t];
		for (int i = 0; i < t; i++) {
			int rows = in.nextInt();
			int cols = in.nextInt();
			long[] rCosts = new long[rows - 1];
			long[] cCosts = new long[cols - 1];
			for (int j = 0; j < rows - 1; j++) {
				rCosts[j] = in.nextLong();

			}
			for (int j = 0; j < cols - 1; j++) {
				cCosts[j] = in.nextLong();

			}
			results[i] = getMinimumCos(rCosts, cCosts);
		}

		in.close();
		for (int i = 0; i < t; i++) {
			System.out.println(results[i]);
		}
	}

	private static long getMinimumCos(long[] rCosts, long[] cCosts) {

		Arrays.sort(rCosts);
		Arrays.sort(cCosts);

		int rows = rCosts.length;
		int cols = cCosts.length;
		int rowCount = 1;
		int colCount = 1;

		int rowIndex = rows - 1, colIndex = cols - 1;
		long totalCost = 0;
		while (rowIndex >= 0 && colIndex >= 0) {
			if (cCosts[colIndex] > rCosts[rowIndex]) {
				totalCost += rowCount * cCosts[colIndex];
				colIndex--;
				colCount++;
			} else {
				totalCost += colCount * rCosts[rowIndex];
				rowIndex--;
				rowCount++;
			}
		}

		while (rowIndex >= 0) {
			totalCost += colCount * rCosts[rowIndex];
			rowIndex--;
		}

		while (colIndex >= 0) {
			totalCost += rowCount * cCosts[colIndex];
			colIndex--;
		}
		
		totalCost = totalCost % (1000000007);
		return totalCost;
	}
}
