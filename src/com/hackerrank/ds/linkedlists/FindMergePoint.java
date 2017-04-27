package com.hackerrank.ds.linkedlists;

public class FindMergePoint {
  class Node {
    int data;
    Node next;
  }

  int meregeNode(Node headA, Node headB) {

    int lenA = 0;
    int lenB = 0;

    Node temp = headA;

    while (temp != null) {
      lenA++;
      temp = temp.next;
    }

    temp = headB;
    while (temp != null) {
      lenB++;
      temp = temp.next;
    }

    int count = 0;
    if (lenA > lenB) {
      temp = headA;
      while (count < (lenA - lenB)) {
        count++;
        temp = temp.next;
      }
      headA = temp;
    } else if (lenA < lenB) {
      temp = headB;
      while (count < (lenB - lenA)) {
        count++;
        temp = temp.next;
      }
      headB = temp;
    }

    temp = headA;
    Node temp1 = headB;
    while (temp != null) {

      if (temp.data == temp1.data) {
        return temp.data;
      }
      temp = temp.next;
      temp1 = temp1.next;
    }
    return -1;
  }
}
