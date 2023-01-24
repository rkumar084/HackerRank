package com.algorithms.stacks;

import java.util.Stack;

public class DeleteMiddle {

	private static Stack<Integer> numbers = new Stack<Integer>();

	
	private static void deleteMidle(int size) {
		if(size == 0) {
			numbers.pop();
			return;
		}
		int x = numbers.pop();
		deleteMidle(--size);
		numbers.push(x);
	}
	

	public static void main(String[] args) {
		//Stack<Integer> numbers = new Stack<Integer>();
		numbers.push(1);
		numbers.push(2);
		numbers.push(3);
		numbers.push(4);
		numbers.push(5);
		numbers.push(6);
		
		
		System.out.println("Before : " + numbers);
		deleteMidle(numbers.size()/2);
		System.out.println("After : " + numbers);
	}


}
