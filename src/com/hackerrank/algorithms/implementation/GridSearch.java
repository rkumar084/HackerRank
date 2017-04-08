package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		boolean[] results = new boolean[t];
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] G = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String[] P = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			results[a0] = isSubMatrix(G, P, 0);
		}
		in.close();
		for (int a0 = 0; a0 < t; a0++) {
			if (results[a0] == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static boolean isSubMatrix(String[] g, String[] p, int row) {

		if (row > (g.length - p.length)) {
			return false;
		}

		int index = g[row].indexOf(p[0]);
		
		while (index != -1) {
			int rowEqualCount = 0;
			for (int i = 0; i < p.length; i++) {
				if (g[row + i].substring(index, index + p[i].length()).equals(
						p[i])) {
					rowEqualCount ++;
				} else {
					break;
				}
			}
			if (rowEqualCount == p.length) {
				return true;
			}	
			index = g[row].indexOf(p[0], index + 1) ;
		}
		return isSubMatrix(g, p, row + 1);
	}
}
