package com.hackerrank.ds.linkedlists;

public class InsertIntoCircularSorted {

	private static class ListNode {
		int val;
		ListNode next;
	}

	private static ListNode list1;

	public static void main(String[] args) {
		
		int[] nums = { 4,3,1 };
		for (int a : nums) {
			addAtHead1(a);
		}
		printLn(list1);

		printLn(insert(list1, 5));
	}

	public static void printLn(ListNode head) {
		if (head == null)
			return;
		ListNode tmp = head;
		 do{
			System.out.println(tmp.val + ", ");
			tmp = tmp.next;
		}while (tmp != head);
	}

	public static void addAtHead1(int val) {
		ListNode node = new ListNode();
		node.val = val;
		node.next = node;
		if (list1 == null) {
			list1 = node;
			return;
		}

		node.next = list1;
		list1 = node;
	}

	public static ListNode insert(ListNode head, int insertVal) {

		ListNode newNode = new ListNode();
        newNode.val=insertVal;
        
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ListNode tmp = head;

        do {
            if (tmp.val > max) {
                max = tmp.val;
            }
            if (tmp.val < min) {
                min = tmp.val;
            }
        }while (tmp!=null);
        
        tmp = head;
        
        // insert after largest element
        if (insertVal < min || insertVal > max) {
        
            while (tmp.val !=max) {
                tmp = tmp.next;
            }
        } else {
            tmp = head;
            ListNode next = head.next;

            while(!(tmp.val < insertVal && next.val > insertVal)) {
                tmp = tmp.next;
                next = next.next;
            }
        }
        
        newNode.next = tmp.next;
        tmp.next = newNode;
        return head;
    }

}
