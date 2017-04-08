package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/encryption
public class Encryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputInitial = in.nextLine();
		in.close();
		
		String input = inputInitial.replaceAll("\\s+","");
		
		char[] inputArr = input.toCharArray();

		int len = input.length();

		int row = (int) Math.floor(Math.sqrt((double) len));
		int col = (int) Math.ceil(Math.sqrt((double) len));

		if (row * row >= len) {
			col = row;
		} else if (row * col >= len) {

		} else if (col * col >= len) {
			row = col;
		}

		char[][] matrix = new char[row][col];
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (count < inputArr.length) {
					matrix[i][j] = inputArr[count];
					count++;
				} else  {
					matrix[i][j] = ' ';
					count++;			
				}
			}
		}

		boolean first = true;
		for (int i = 0; i < col; i++) {
			StringBuilder outputtoken = new StringBuilder();
			if (first) {
				first = false;
			} else {
				outputtoken.append(" ");
			}

			for (int j = 0; j < row; j++) {
				if (matrix[j][i] != ' ') {
					outputtoken.append(matrix[j][i]);
				}
			}
			System.out.print(outputtoken.toString());
		}
	}
}
