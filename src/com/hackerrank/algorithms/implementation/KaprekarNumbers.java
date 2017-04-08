package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/kaprekar-numbers
public class KaprekarNumbers {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		in.close();
		StringBuilder kNumbers = new StringBuilder();
		
		boolean isFirst = true;
		for (int i = p; i <= q; i++) {
		
			if (isKaprekarNumber(i) == true) {
				if (isFirst) {
					isFirst = false;
				} else {
					kNumbers.append(" ");
				}
				kNumbers.append(i);
			}
		}

		
		if (kNumbers.toString().isEmpty()) {
			System.out.println("INVALID RANGE");
		} else {
			System.out.println(kNumbers.toString());
		}
	}
	
	public static boolean isKaprekarNumber(int num) { 
		
		Long square = (long)num*num;
		String digits = square.toString();
		
		int mid = digits.length()/2;
		String l = digits.substring(0, mid);
		String r = digits.substring(mid, digits.length());
		
		if (Integer.parseInt(r) == 0) 
			return false;
		Integer sum = 0;
		if (mid == 0) {
			sum = Integer.parseInt(r);
		} else {
		 sum = Integer.parseInt(l) + Integer.parseInt(r);
		} 
		if (sum == num) {
			return true;
		}	
//		for (int i = 0; i < digits.length() -1; i++) {
//		}
		
		return false;
	}
}
