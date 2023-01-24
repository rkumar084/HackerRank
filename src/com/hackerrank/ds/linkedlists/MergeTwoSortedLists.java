package com.hackerrank.ds.linkedlists;

public class MergeTwoSortedLists {

	private static class ListNode {
		int val;
		ListNode next;
	}

	private static ListNode list1;
	private static ListNode list2;

	public static void main(String[] args) {
		int[] nums = { 4, 2, 1 };
		for (int a : nums) {
			addAtHead1(a);
		}
		printLn(list1);
		int[] nums1 = { 4, 3, 1 };
		for (int a : nums1) {
			addAtHead2(a);
		}
		printLn(list2);

		printLn(mergeTwoLists(list1, list2));
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

	
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null) {
            return list2;
        } 
        
        if (list2 == null) {
            return list1;
        }
        
        ListNode t1 = list1, t2 = list2, mhead=null, next;
        
        while(t1!=null && t2!=null) {
            if (t1.val < t2.val) {
                next = t1.next;
                if (mhead == null) {
                    mhead = t1;
                    t1.next=null;
                } else {
                    t1.next=mhead;
                    mhead = t1;
                }
                t1 = next;
            } else {
                next = t2.next;
                if (mhead == null) {
                    mhead = t2;
                    t2.next=null;
                } else {
                    t2.next=mhead;
                    mhead = t2;
                }
                t2 = next;                
            }
        }
        
        if (t1==null) {
            while(t2!= null) {
                next=t2.next;
                t2.next=mhead;
                mhead=t2;
                t2=next;
            }
        }

        if (t2==null) {
            while(t1!= null) {
                next=t1.next;
                t1.next=mhead;
                mhead=t1;
                t2=next;
            }
        }
        
        t1 = mhead;
        ListNode revHead = null;
        while(t1!=null) {
        	next=t1.next;
        	
        	if (revHead == null) {
        		revHead = t1;
        		t1.next=null;
        	} else {
        		t1.next=revHead;
        		revHead = t1;
        	}
        	t1 = next;
        }
        return revHead;
    }

}
