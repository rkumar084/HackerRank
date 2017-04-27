package com.hackerrank.ds.linkedlists;

public class ReverseLinkedList {

  class Node {
    int data;
    Node next;
  }

  Node reverse(Node head) {

    Node reverseHead = null;

    if (head == null || head.next == null) {
      return head;
    }

    Node tmp1 = head;
    Node tmp2 = tmp1.next;

    while (tmp1 != null) {
      tmp1.next = reverseHead;
      reverseHead = tmp1;

      tmp1 = tmp2;
      if (tmp2 != null) {
        tmp2 = tmp2.next;
      }
    }
    return reverseHead;
  }
}
