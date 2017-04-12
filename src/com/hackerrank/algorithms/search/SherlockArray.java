package com.hackerrank.algorithms.search;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/sherlock-and-array
public class SherlockArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		boolean[] results = new boolean[t];
		for (int i = 0; i < t; i++) {
			int size = in.nextInt();
			int[] elements = new int[size];
			for (int j = 0; j < size; j++) {
				elements[j] = in.nextInt();
			}
			results[i] = hasElement(elements);
		}
		in.close();
		for (int i = 0; i < t; i++) {
			if (results[i]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}
		}
	}

	private static boolean hasElement(int[] elements) {

		long leftSum = 0;
		long rightSum = 0;
		for (int i = 1; i < elements.length; i++) {
			rightSum += elements[i];
		}

		for (int i = 0; i < elements.length;) {
			if (leftSum == rightSum) {
				return true;
			}
			leftSum = leftSum + elements[i];
			i++;
			if (i >= elements.length - 1) {
				rightSum = 0;
			} else {
				rightSum = rightSum - elements[i];
			}
		}
		return false;
	}
}
