package com.algorithms.stacks;

import java.util.Stack;

public class NextGreaterFrequency {

	
	private static void printNextGreaterFrequency(int[] arr, int[] farr) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i ++) {
			if(stack.isEmpty()) {
				stack.push(farr[arr[i]]);
				System.out.println(farr[arr[i]] + " -> " + -1);
			} else {
				int top = stack.pop();
				if (farr[arr[i]] < top) {
					stack.push(farr[arr[i]]);
					System.out.println(farr[arr[i]] + " -> " + top);
				} else {
					while (!stack.isEmpty() && stack.peek() > farr[arr[i]]) {
						stack.pop();
					}
					if(stack.isEmpty()) {
						System.out.println(farr[arr[i]] + " -> " + -1);
					} else  {
						stack.push(farr[arr[i]]);
						System.out.println(farr[arr[i]] + " -> " + stack.peek());
					}
				}
			}
		}
		
	}
	
	
	private static int[] getFrequencyArray(int[] arr) {
		int max = 0;
		for(int a : arr) {
			if (max < a)
				max = a;
		}
		
		int[] hashArr = new int[max + 1];
		
		for(int i = 0; i < hashArr.length; i++) {
			hashArr[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			hashArr[arr[i]] ++;
		}

		
//		for(int a : hashArr) {
//			//if (a!=0)
//				System.out.println(a);
//		}
		
		return hashArr;
	}
	
	private static void printArr (int[] arr) {
		for(int a: arr) {
			System.out.println(a+ ", " );
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,2,1};
		
		int[] farr = getFrequencyArray(arr);
		printNextGreaterFrequency(arr, farr);
		//printArr(farr);
		
	}

}
