package com.hackerrank.ds.linkedlists;

public class OddEvenLinkedList {

	private static class Node {
		int val;
		Node next;
	}
	
	private static Node head;
	
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		for (int a : nums) {
			addAtHead(a);
		}
		//printLn(head);
		printLn(oddEvenList(head));

	}
	
	public static void printLn(Node head) {
		if (head==null) return;
		Node tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.val +", ");
			tmp = tmp.next;
		}
	}
	
    public static void addAtHead(int val) {
        Node node = new Node();
        node.val= val;
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }
        
        node.next = head;
        head = node;
    }
    
   public static Node oddEvenList(Node head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        
        Node ehead = null, ohead=null, etmp = null, otmp=null, tmp=head, next =null;
        int index = 0;
        while (tmp!=null) {
        	next=tmp.next;
            if (index%2 == 0) {
                if (ehead==null){
                    ehead=tmp;
                    etmp=tmp;
                }
                if(tmp.next!=null && tmp.next.next!=null){
                    etmp.next=tmp.next.next;
                    etmp = etmp.next;
                } else {
                    etmp.next=null;
                }
                
            } else {
                if (ohead==null){
                    ohead=tmp;
                    otmp=tmp;
                }
                if(tmp.next!=null && tmp.next.next!=null){
                    otmp.next=tmp.next.next;
                    otmp = otmp.next;
                } else {
                    otmp.next=null;
                }
                
            }
            index++;
            tmp=next;
        }
        etmp.next=ohead;                    
        return ehead;
    }

}
