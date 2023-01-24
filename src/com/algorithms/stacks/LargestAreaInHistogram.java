package com.algorithms.stacks;

import java.util.Stack;

public class LargestAreaInHistogram {

	
	private static int[] getNextGreaterIndices(int[] hist) {
		int[] nextGreaterIndecies = new int[hist.length];
		
		
		return nextGreaterIndecies;
	}

	private static int[] getPerviousSmallerIndices(int[] arr) { 
		int[] prevSmallerIndecies = new int[arr.length];
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			if (stack.isEmpty()) {
				System.out.println(a + "-->" + -1);
				prevSmallerIndecies[i] = -1;
				stack.push(i);
			} else {
				int top = stack.peek();
				if (arr[top] < a) {
					System.out.println(a + "-->" +arr[top]);
					prevSmallerIndecies[i] = top;
					stack.push(i);
				} else {
					
					while(!stack.empty() && arr[stack.peek()] >= a) {
						stack.pop();
					}
					if(stack.empty()) {
						System.out.println(a + "-->" +-1);
						prevSmallerIndecies[i] = -1;
						stack.push(i);
					} else {
						System.out.println(a + "-->" + arr[stack.peek()]);
						prevSmallerIndecies[i] = stack.peek();
						stack.push(i);
					}
				}
			}
		}
		
		return prevSmallerIndecies;
	}

	private static int[] getNextSmallerIndices(int[] arr) { 
		int[] nextSmallerIndecies = new int[arr.length];
		Stack<Integer> stack = new Stack();
		int len = arr.length;
		for (int i = arr.length - 1; i >= 0; i--) {
			int a = arr[i];
			if (stack.isEmpty()) {
				System.out.println(a + "-->" + 9);
				nextSmallerIndecies[i] = len;
				stack.push(i);
			} else {
				int top = stack.peek();
				if (arr[top] < a) {
					System.out.println(a + "-->" +arr[top]);
					nextSmallerIndecies[i] = top;
					stack.push(i);
				} else {
					
					while(!stack.empty() && arr[stack.peek()] >= a) {
						stack.pop();
					}
					if(stack.empty()) {
						System.out.println(a + "-->" +9);
						nextSmallerIndecies[i] = len;
						stack.push(i);
					} else {
						System.out.println(a + "-->" + arr[stack.peek()]);
						nextSmallerIndecies[i] = stack.peek();
						stack.push(i);
					}
				}
			}
		}
		
		return nextSmallerIndecies;
	}
	
	private static void printArr(int[] arr) {
		for(int i=0; i< arr.length; i ++) {
			System.out.println(arr[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		int[] hist = {4,2,1,5,6,3,2,4,2};
		int[] prevsmall = getPerviousSmallerIndices(hist);
		int[] nextsmall = getNextSmallerIndices(hist);
		
		int maxarea = 0;
		
		printArr(prevsmall);
		printArr(nextsmall);
		
		for(int i=0; i< hist.length; i ++) {
			int currarea = (nextsmall[i] - prevsmall[i] - 1)*hist[i];
			if (currarea > maxarea)
				maxarea = currarea;
		}
		System.out.println("Max area = " + maxarea);
	}

}
