package com.hackerrank.ds.linkedlists;

import com.hackerrank.ds.linkedlists.JoesepthsCircle.Node;

public class ReverseLLInPairs {

	static class Node {
		int data;
		Node next;				
		public Node() {}
	}

	private static Node createLL(int[] elements) {
		
		Node head = null;
		
		if (elements.length == 0)
			return null;
		
		boolean first = true;
		
		for (int i = 0; i < elements.length; i ++){
			Node temp = new ReverseLLInPairs.Node();
			temp.data = elements[i];
			
			if (first) {
				temp.next = null;
				head = temp;
				first = false;
			} else {
				temp.next=head;
				head = temp;				
			}			
		}	
		return head;	
	}
	
	private static void printCLL(Node head) {
		if (head == null) {
			System.out.println("No nodes");
			return;
		}
		
		Node temp = head;
		do {
			System.out.println(temp.data + ", ");
			temp = temp.next;
		} while (temp!= null);
	}
	
	public static Node reverseLLInparis(Node head, int k) {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}

		if (head.next == null) {
			System.out.println("Single node nothing to reverse");
			return null;
		}

		if (k < 2) {
			System.out.println("segment length should be greater than 1");
			return null;
		}

		Node reverseBegin = null;
		//boolean first = true;
		
		Node curr = head;
		Node next = null;

		int count = 0;
		while (count < k && curr !=null) {
			
			next = curr.next;
			curr.next = reverseBegin;
			reverseBegin = curr;
			curr = next;
			count++;

		}
		//head.next = reverseBegin;
		if (next!=null) {
			head.next = reverseLLInparis(next,k);
		} 
		return reverseBegin;

		
	}
	
	public static void main(String[] args) {
		//int[] elements = {1,2,3,4,5};
		int[] elements = {8,7,6,5,4,3,2,1};
		Node head = createLL(elements);
		System.out.println("Before reverse");
		printCLL(head);

		head = reverseLLInparis(head,3);
		System.out.println("After reverse");

		printCLL(head);
		//findJosephusNode(head, 3);
		//printCLL(head);
	}
}
