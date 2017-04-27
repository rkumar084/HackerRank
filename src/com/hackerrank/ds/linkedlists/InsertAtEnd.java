package com.hackerrank.ds.linkedlists;

public class InsertAtEnd {
  class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public void setData(int data) {
      this.data = data;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public Node getNext() {
      return next;
    }
  }

  Node Insert(Node head, int data) {
    if (head == null) {
      return head = new Node(data, null);
    }

    Node temp = head;
    while (true) {
      if (temp.getNext() == null){
        break;
      } else {
        temp = temp.getNext();
      }
    }
    temp.setNext(new Node(data, null));
    return head;
  }
}
