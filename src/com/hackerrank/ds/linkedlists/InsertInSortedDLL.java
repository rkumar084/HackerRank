package com.hackerrank.ds.linkedlists;

public class InsertInSortedDLL {
  class Node {
    int data;
    Node next;
    Node prev;
  }

  Node sortedInsert(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    newNode.prev = null;

    if (head == null) {
      return head = newNode;
    }

    Node insertBefore = head;
    Node lastNode = null;
    while (insertBefore != null) {
      if (insertBefore.data > data) {
        break;
      }
      if (insertBefore.next == null) {
        lastNode = insertBefore;
      }
      insertBefore = insertBefore.next;
    }

    if (insertBefore == head) { // at start
      newNode.next = insertBefore;
      insertBefore.prev = newNode;
      head = newNode;
    } else if (insertBefore == null) { // at end
      newNode.prev = lastNode;
      lastNode.next = newNode;
    } else { // middle
      Node tmp = insertBefore.prev;
      newNode.next = insertBefore;
      newNode.prev = tmp;
      insertBefore.prev = newNode;
      tmp.next = newNode;
    }
    return head;
  }
}
