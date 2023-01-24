package com.hackerrank.ds.linkedlists;

public class SplitCLL {

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
			Node temp = new SplitCLL.Node();
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
	
	public static void splitCLL(Node head) {

		if (head.next == head) {
			System.out.println("Only one node, nothing to split");
			return;
		}
		
		Node slow = head;
		Node fast = head.next;
		
		do {
			slow = slow.next;
			fast = fast.next;
			if (fast.next!=head) {
				fast = fast.next;
			}			
		} while (fast.next != head);
		
		
		Node h1, h2 = null;
		h1 = head;
		h2 = slow.next;
		
		slow.next = h1;
		fast.next = h2;
		
		printCLL(h1);
		System.out.println("Second half");
		printCLL(h2);
	}
	
	public static void main(String[] args) {
		int[] elements = {1,2,3,4};
		Node head = createCLL(elements);
		splitCLL(head);
		//printCLL(head);
	}

}
