package com.hackerrank.ds.linkedlists;

public class GetNodeFromEnd {
  class Node {
    int data;
    Node next;
  }

  int getNodeFromEnd(Node head, int position) {
    int size = 0;

    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;
    }

    int positionFromStart = size - position;

    int count = 1;
    temp = head;
    while (temp != null) {

      if (count == positionFromStart) {
        return temp.data;
      }
      temp = temp.next;
      count++;
    }
    return -999;
  }
}
