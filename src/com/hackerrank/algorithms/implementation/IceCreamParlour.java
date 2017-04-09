package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/icecream-parlor
public class IceCreamParlour {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] results = new String[t];
		for (int a0 = 0; a0 < t; a0++) {
			int m = in.nextInt();
			int n = in.nextInt();
			int[] costs = new int[n];
			for (int i = 0; i < n; i++) {
				costs[i] = in.nextInt();
			}
			results[a0] = getPair(costs, m);
		}
		in.close();
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println(results[a0]);
		}
	}

	private static String getPair(int[] costs, int m) {
		String pair = "";

		Map<Integer, String> indexMap = new HashMap<>();

		for (int i = 0; i < costs.length; i++) {
			if (indexMap.containsKey(costs[i])) {
				String value = indexMap.get(costs[i]);
				String newValue = value + " " + (i + 1);
				indexMap.put(costs[i], newValue);
			} else {
				indexMap.put(costs[i], new String((i + 1) + ""));
			}
		}

		Arrays.sort(costs);

		for (int i = 0; i < costs.length; i++) {
			int cost1 = costs[i];
			if (cost1 < m) {
				int cost2 = m - cost1;
				if (binarySearch(costs, cost2)) {
					if (cost1 == cost2) {
						String[] indexes = indexMap.get(cost1).split(" ");
						pair = indexes[0] + " " + indexes[1];
						break;
					} else {
						Integer index1 = Integer.parseInt(indexMap.get(cost1));
						Integer index2 = Integer.parseInt(indexMap.get(cost2));

						if (index1 == Math.min(index1, index2)) {
							pair = index1 + " " + index2;
						} else {
							pair = index2 + " " + index1;
						}
						break;
					}
				}
			}
		}
		return pair;
	}

	private static boolean binarySearch(int[] array, int search) {
		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] == search) {
				return true;
			} else if (array[middle] < search) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		return false;
	}
}
