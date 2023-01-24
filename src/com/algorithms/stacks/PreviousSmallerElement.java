package com.algorithms.stacks;

import java.util.Stack;

public class PreviousSmallerElement {

	private static void printPreviosSmallerElements(int[] arr) {
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			if (stack.isEmpty()) {
				System.out.println(a + "-->" + -1);
				stack.push(a);
			} else {
				int top = stack.peek();
				if (top < a) {
					System.out.println(a + "-->" +top);
					stack.push(a);
				} else {
					
					while(!stack.empty() && stack.peek() > a) {
						stack.pop();
					}
					if(stack.empty()) {
						System.out.println(a + "-->" +-1);
					} else {
						System.out.println(a + "-->" + stack.peek());
						stack.push(a);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,9,2,11, 4, 5, 8, 6};
		printPreviosSmallerElements(arr);
		
	}

}
