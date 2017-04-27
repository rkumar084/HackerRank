package com.hackerrank.ds.linkedlists;

public class CycleDetection {
  class Node {
    int data;
    Node next;
  }

  boolean hasCycle(Node head) {
    if (head == null) {
      return false;
    }

    Node slow = head;
    Node fast = head;
    while (slow != null && fast != null) {
      slow = slow.next;
      Node temp = fast.next;
      if (temp != null){
        fast = temp.next;
      }
      
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}
