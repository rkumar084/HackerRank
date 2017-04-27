package com.hackerrank.ds.linkedlists;

public class InsertAtPosition {
  class Node {
    int data;
    Node next;
  }

  Node Insert(Node head, int data, int position) {

    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (head == null) {
      return head = newNode;
    }

    if (position == 0) {
      newNode.next = head;
      return head = newNode;
    }

    Node temp1 = null;
    Node temp2 = head;

    int count = 1;

    while (count <= position) {
      if (temp2.next == null) {
        break;
      } else {
        temp1 = temp2;
        temp2 = temp2.next;
        count++;
      }
    }

    newNode.next = temp2;
    temp1.next = newNode;
    return head;
  }
}
