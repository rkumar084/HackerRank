package com.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/hackerland-radio-transmitters
public class HackerLandRadioTransmitters {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] x = new int[n];
		for (int x_i = 0; x_i < n; x_i++) {
			x[x_i] = in.nextInt();
		}

		in.close();
		Arrays.sort(x);

		int transmitterCount = 0;
		int startIndex = 0;
		int fixPosition = 0;

		//while (startIndex  ) {
		while(true) {
			fixPosition = startIndex;
			while ((fixPosition + 1 < n) && (k >= x[fixPosition + 1] - x[startIndex])) {
				fixPosition++;
			}

			transmitterCount++;
			startIndex = fixPosition;
			while ((startIndex + 1 < n) && (k >= x[startIndex] - x[fixPosition])) {
				startIndex++;
			}
			
			if (k >= x[n-1] - x[fixPosition]) {
				break;
			}
		}
		
		System.out.println(transmitterCount);
	}
}
