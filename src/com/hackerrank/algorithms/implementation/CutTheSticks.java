package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/cut-the-sticks
public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		List<Integer> stickHts = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			stickHts.add(in.nextInt());
		}

		in.close();
		printNoOfCutSticks(stickHts);

	}

	public static void printNoOfCutSticks(List<Integer> stickHts) {
		if (stickHts.size() == 0)
			return;
		System.out.println(stickHts.size());

		int min = Integer.MAX_VALUE;
		for (Integer ht : stickHts) {
			if (min > ht)
				min = ht;
		}

		List<Integer> modifiedHts = new ArrayList<>();
		for (Integer ht : stickHts) {
			if (ht != min) {
				modifiedHts.add(ht);
			}
		}
		printNoOfCutSticks(modifiedHts);
	}
}
