package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Solution for problem at https://www.hackerrank.com/challenges/happy-ladybugs
public class HappyLadyBugs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		for (int a0 = 0; a0 < Q; a0++) {
			int n = in.nextInt();
			String b = in.next();
			checkHappyLadyBug(b);
		}
		in.close();
	}

	public static void checkHappyLadyBug(String s) {
		if (s == null || s.length() == 0) {
			System.out.println("NO");
			return;
		}
		boolean hasUnderscore = s.contains("_");
		if (!hasUnderscore) {
			char[] cAr = s.toCharArray();
			int charCount = 1;
			int currentChar = cAr[0];
			for (int i = 1; i < cAr.length; i++) {
				if ((int) cAr[i] == currentChar) {
					charCount++;
				} else {
					if (charCount < 2) {
						System.out.println("NO");
						return;
					} else {
						charCount = 1;
						currentChar = cAr[i];
					}
				}
			}
			if (charCount == 1) {
				System.out.println("NO");
				return;
			} else {
				System.out.println("YES");
				return;
			}
		}
		Map<String, Integer> charMap = new HashMap<>();

		for (char c : s.toCharArray()) {
			if (c != '_') {
				if (charMap.containsKey(c + "")) {
					Integer count = charMap.get(c + "");
					charMap.put("" + c, ++count);
				} else {
					charMap.put("" + c, new Integer(1));
				}
			}
		}

		boolean areHappyBugs = true;
		for (Map.Entry<String, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() < 2) {
				areHappyBugs = false;
			}
		}

		if (areHappyBugs)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
