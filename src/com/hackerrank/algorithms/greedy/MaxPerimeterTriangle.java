package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/maximum-perimeter-triangle
public class MaxPerimeterTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] lengths = new int[n];	
		for (int i = 0; i < n; i++) {
			lengths[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(lengths);
		int maxArea = 0;
		boolean found = false;
		for (int i = n-1; i >=2 ; i--) {
			int side1 = lengths[i];
			int side2 = lengths[i-1];
			int side3 = lengths[i-2];
			
			if (side2+side3 > side1) {
				System.out.println(side3 + " "+ side2 + " " + side1);
				found = true;
				break;
			}
			
		}
		
		if (found== false) {
			System.out.println("-1");
		}
	}

}
