package com.hackerrank.ds.linkedlists;

public class AdditionOfLists {

	private static class ListNode {
		int val;
		ListNode next;
	}

	private static ListNode list1;
	private static ListNode list2;

	public static void main(String[] args) {
		
		int[] nums = { 3, 4, 2 };
		for (int a : nums) {
			addAtHead1(a);
		}
		printLn(list1);
		int[] nums1 = { 4, 6, 5 };
		for (int a : nums1) {
			addAtHead2(a);
		}
		printLn(list2);

		printLn(addTwoNumbers(list1, list2));
	}

	public static void printLn(ListNode head) {
		if (head == null)
			return;
		ListNode tmp = head;
		while (tmp != null) {
			System.out.println(tmp.val + ", ");
			tmp = tmp.next;
		}
	}

	public static void addAtHead1(int val) {
		ListNode node = new ListNode();
		node.val = val;
		node.next = null;
		if (list1 == null) {
			list1 = node;
			return;
		}

		node.next = list1;
		list1 = node;
	}

	public static void addAtHead2(int val) {
		ListNode node = new ListNode();
		node.val = val;
		node.next = null;
		if (list2 == null) {
			list2 = node;
			return;
		}

		node.next = list2;
		list2 = node;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

//		l1 = reverseList(l1);
//		l2 = reverseList(l2);
		int carry = 0;
		ListNode t1 = l1, t2 = l2, res = null;

		while (t1 != null && t2 != null) {
			int sum = t1.val + t2.val + carry;
			carry = sum / 10;

			ListNode digit = new ListNode();
			digit.val = sum % 10;
			digit.next = null;
			if (res == null) {
				res = digit;
			} else {
				digit.next = res;
				res = digit;
			}
			t1 = t1.next;
			t2 = t2.next;
		}

		if (t1 == null) {
			while (t2 != null) {
				int sum = t2.val + carry;
				carry = sum /10;
				ListNode digit = new ListNode();
				digit.val = sum % 10;

				digit.next = res;
				res = digit;
				t2 = t2.next;
			}
		}

		if (t2 == null) {
			while (t1 != null) {
				int sum = t1.val + carry;
				carry = sum / 10;
				ListNode digit = new ListNode();
				digit.val = sum % 10;

				digit.next = res;
				res = digit;
				t1 = t1.next;
			}
		}

		if (carry != 0) {
			ListNode digit = new ListNode();
			digit.val = carry;
			digit.next = res;
			res = digit;
		}
		return reverseList(res);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode revHead = null, tmp = head, next = null;

		while (tmp != null) {
			next = tmp.next;
			if (revHead == null) {
				revHead = tmp;
				tmp.next = null;
			} else {
				tmp.next = revHead;
				revHead = tmp;
			}
			tmp = next;
		}
		return revHead;
	}

}
