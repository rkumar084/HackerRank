package com.algorithms.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingSIngleQ {

	private static Queue<Integer> q1 = new LinkedList<Integer>();
	//private static Queue<Integer> q2 = new LinkedList<Integer>();
	
	private static int pop() {
		int count = 1;
		while(count < q1.size()) {
			int a = q1.remove();
			q1.add(a);
			count++;
		}
		return q1.remove();
	}
	
	private static void push(int a) {
		q1.add(a);		
	}
	
	private static void displayQ () {
		for(int a : q1)
			System.out.println(a + ", ");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. push  2. pop 3. display 4. exit");
			int input = scanner.nextInt();
			switch(input) {
			case 1:
				System.out.println("Enter the element to push.");
				int ele = scanner.nextInt();
				push(ele);
				break;
			case 2:
				pop();
				break;
				
			case 3:
				displayQ();
				break;
			case 4: 
				System.exit(0);
			}
		}
	}
}
