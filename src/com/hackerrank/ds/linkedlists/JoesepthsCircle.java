package com.hackerrank.ds.linkedlists;

public class JoesepthsCircle {

	static class Node {
		int data;
		Node next;				
		public Node() {}
	}

	private static Node createCLL(int[] elements) {
		
		Node head = null;
		Node last = null;
		
		if (elements.length == 0)
			return null;
		
		boolean first = true;
		
		for (int i = 0; i < elements.length; i ++){
			Node temp = new JoesepthsCircle.Node();
			temp.data = elements[i];
			
			if (first) {
				temp.next = temp;
				head = temp;
				last = temp;				
				first = false;
			} else {
				temp.next=head;
				head = temp;				
			}			
		}	
		last.next = head;
		return head;	
	}
	
	private static void printCLL(Node head) {
		if (head == null) {
			System.out.println("No nodes");
		}
		
		Node temp = head;
		do {
			System.out.println(temp.data + ", ");
			temp = temp.next;
		} while (temp!= head);
	}
	
	public static void findJosephusNode(Node head, int m) {

		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		
		int count = 2;
		Node temp = head;
		while(temp.next != temp) {
			if (count == m) {
				count = 2;
				temp.next = temp.next.next;
			}
			temp = temp.next;
			count++;
		}
		
		System.out.println("Final remaining node: " + temp.data);
	}
	
	public static void main(String[] args) {
		//int[] elements = {1,2,3,4,5};
		int[] elements = {5,4,3,2,1};
		Node head = createCLL(elements);
		printCLL(head);
		findJosephusNode(head, 3);
		//printCLL(head);
	}

}

