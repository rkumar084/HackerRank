package com.hackerrank.ds.linkedlists;

public class IsPalindrome {

	private static class Node {
		int val;
		Node next;
	}

	private static Node head;

	public static void main(String[] args) {
		int[] nums = { 1,2,2,1 };
		for (int a : nums) {
			addAtHead(a);
		}
		 printLn(head);
		//printLn(oddEvenList(head));
		System.out.println(isPalindrome(head));
	}

	public static void printLn(Node head) {
		if (head == null)
			return;
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.val + ", ");
			tmp = tmp.next;
		}
	}

	public static void addAtHead(int val) {
		Node node = new Node();
		node.val = val;
		node.next = null;
		if (head == null) {
			head = node;
			return;
		}

		node.next = head;
		head = node;
	}

	public static boolean isPalindrome(Node head) {

		if (head == null)
			return false;

		Node tmp = head, mid = null;
		int length = 0, midIndex = 0, count = 0;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}

		boolean isEven = false;
		if (length % 2 == 0) {
			isEven = true;
		}
		midIndex = length / 2 + 1;

		count = 0;
		tmp = head;
		while (tmp != null) {
			count++;
			if (count == midIndex) {
				mid = tmp;
				break;
			}
			tmp = tmp.next;
		}

		// Reverse starting from mid
		Node next, revHead = null;
		if (!isEven) {
			mid = mid.next;
		}
		tmp = mid;
		while (tmp != null) {
			next = tmp.next;
			if (revHead == null) {
				tmp.next = null;
				revHead = tmp;
			} else {
				tmp.next = revHead;
				revHead = tmp;
			}
			tmp = next;
		}

		tmp = revHead;
		Node tmp1 = head;
		while (tmp != null) {
			if (tmp.val == tmp1.val) {
				tmp = tmp.next;
				tmp1 = tmp1.next;
			} else {
				return false;
			}

		}
		return true;
	}

}
