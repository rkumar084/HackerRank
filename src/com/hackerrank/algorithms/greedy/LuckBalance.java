package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/luck-balance
public class LuckBalance {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String first = in.nextLine();
		String[] firstArr = first.split(" ");
		int n = Integer.parseInt(firstArr[0]);
		int k = Integer.parseInt(firstArr[1]);

		int[] luckArr = new int[n];

		long luckBalance = 0;
		for (int i = 0; i < n; i++) {
			String params = in.nextLine();

			String[] paramsArr = params.split(" ");
			int luckSocre = Integer.parseInt(paramsArr[0]);
			int importance = Integer.parseInt(paramsArr[1]);

			if (importance == 0) {
				luckBalance += luckSocre;
				luckArr[i] = 0;
			} else {
				luckArr[i] = luckSocre;
			}

		}

		in.close();
		Arrays.sort(luckArr);
		int indexImp = 0;
		for (int i = 0; i < n; i++) {
			if (luckArr[i] != 0) {
				indexImp = i;
				break;
			}
		}

		// int indexStratOfLossing = 0;

		for (int i = indexImp; i < luckArr.length; i++) {
			if (i > (luckArr.length - k - 1))
				luckBalance += luckArr[i];
			else
				luckBalance -= luckArr[i];
		}
		System.out.println(luckBalance);
	}
}
