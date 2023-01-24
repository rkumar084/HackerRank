package com.algorithms.stacks;

import java.util.Stack;

public class ReverseStack {

	private static Stack<Integer> numbers = new Stack<Integer>();

	private static void reverse() {
		if(numbers.isEmpty()) {
			return;
		}
		int x = numbers.pop();
		reverse();
		pushToBottom(x);
	}
	
	private static void pushToBottom(int a) {
		if(numbers.isEmpty()) {
			numbers.push(a);
			return;
		}
		int x = numbers.pop();
		pushToBottom( a);
		numbers.push(x);
	}
	

	public static void main(String[] args) {
		//Stack<Integer> numbers = new Stack<Integer>();
		numbers.push(1);
		numbers.push(2);
		numbers.push(3);
		numbers.push(4);
		numbers.push(5);
		
		
		System.out.println("Before : " + numbers);
		reverse();
		System.out.println("After : " + numbers);
	}
}
