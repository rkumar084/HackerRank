package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/*Given a word , rearrange the letters of  to construct another word  in such a way 
 that  is lexicographically greater than . In case of multiple possible answers, 
 find the lexicographically smallest one among them.
 */
public class BiggerIsGreater {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());

		for (int i = 0; i < size; i++) {
			String s = in.nextLine();
			printNextBigger(s, s.length() - 1, 1);
		}
		in.close();
	}

	public static void printNextBigger(String s, int pos, int distance) {

		if (distance == s.length()) {
			System.out.println("no answer");
			return;
		}
		if (pos - distance < 0) {
			printNextBigger(s, s.length() - 1, distance + 1);
			return;
		}

		int lesserAlphabetPosition = -1;
		char[] sArr = (new String(s)).toCharArray();
		for (int i = (pos - 1); i >= pos - distance; i--) {
			if ((int) sArr[pos] > (int) sArr[i]) {
				lesserAlphabetPosition = i;
				break;
			}
		}

		if (lesserAlphabetPosition != -1) {
			// swap
			char temp = sArr[pos - distance];
			sArr[pos - distance] = sArr[pos];
			sArr[pos] = temp;

			Arrays.sort(sArr, pos - distance + 1, sArr.length);
			System.out.println(sArr);
			return;
		} else {
			printNextBigger(s, pos - 1, distance);
		}
	}
}
