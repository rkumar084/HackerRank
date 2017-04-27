package com.hackerrank.ds.linkedlists;

public class DeleteDuplicatesInSortedLL {

  class Node {
    int data;
    Node next;
  }

  Node removeDuplicates(Node head) {
    if (head == null) return head;

    Node temp1 = head;
    Node temp2 = head.next;

    while (temp2 != null) {

      if (temp1.data == temp2.data) {
        temp1.next = temp2.next;
        temp2 = temp1.next;
      } else {
        temp1 = temp1.next;
        temp2 = temp2.next;
      }
    }
    return head;
  }
}
