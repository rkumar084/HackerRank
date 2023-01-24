package com.algorithms.stacks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DeleteConsecutiveSameWords {
	
	public static void main1(String[] args) {
		String str = "the king sultan sultan king senate";
		Stack<String> stack = new Stack();
		
		List<String> words = Arrays.asList(str.split(" "));
		
		for (int i =0; i < words.size(); i++) {
			String word = words.get(i);
			if (stack.isEmpty()) {
				stack.push(word);
			} else {
				String top = stack.peek();
				if(top.equals(word)) {
					stack.pop();
				} else {
					stack.push(word);	
				}
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	
	public static void main(String[] args) {
		String str = "the king sultan sultan king senate";
		List<String> words = new LinkedList(Arrays.asList(str.split(" ")));

		for (int i = 0; i < words.size() - 1;) {
			String curr = words.get(i);
			String next = words.get(i + 1);
			if (curr.equals(next)) {
				words.remove(i);
				words.remove(i);
				i = i -1;
			} else {
				i++;
			}
		}
		
		for(String s : words) {
			System.out.println(s+" ");
		}
	}
	
}
