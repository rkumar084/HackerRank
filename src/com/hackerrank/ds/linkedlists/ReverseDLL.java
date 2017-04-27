package com.hackerrank.ds.linkedlists;

public class ReverseDLL {

  class Node {
    int data;
    Node next;
    Node prev;
  }

  Node reverse(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node reverseHead = null;
    
    Node temp = head;
    while (temp!= null) {
      Node temp1 = temp;
      temp = temp.next;
     
      // insert temp 1 at beginning of reverseDLL
      temp1.next = reverseHead;
      reverseHead = temp1;
      temp1.prev = null;      
    }
    
    return reverseHead;
  }
}
