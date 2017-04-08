package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/manasa-and-stones
public class ManasaStones {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int count = in.nextInt();
	    String[] outputs = new String[count];
	    
	    for (int i = 0; i<count ; i ++ ) {
	    	int n = in.nextInt();
	    	int a = in.nextInt();
	    	int b = in.nextInt();
	    	outputs[i] = findPossibleValues(n,a,b);
	    }
	    in.close();
	    
	    for (int i = 0; i < count ; i ++ ) {
	    	System.out.println(outputs[i]);
	    }
	}
	
	public static String findPossibleValues(int n, int a, int b) {
		
		int greater = 0;
		int lesser = 0;
		StringBuilder output = new StringBuilder();

		if (a < b) {
			greater = b;
			lesser = a;
		} else if (a > b) {
			greater = a;
			lesser = b;
		} else {
			return output.append((n-1) * a).toString();
		}
		
		int minValue = (n - 1) * lesser;
		boolean first = true;
		for (int i = 0; i < n ; i ++) {
			if (first) {
				first = false;
			} else {
				output.append(" ");
			}
			output.append(minValue + i * (greater - lesser));
		}
		return output.toString();
	}
}

