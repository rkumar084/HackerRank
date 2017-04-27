package com.hackerrank.ds.linkedlists;

public class CompareLinkedLists {

  class Node {
    int data;
    Node next;
  }

  int compareLists(Node headA, Node headB) {
    Node tempA = headA;
    Node tempB = headB;

    while (true) {
      if ((tempA == null && tempB == null)) {
        return 1;
      }
      if ((tempA == null && tempB != null) || (tempA != null && tempB == null)) {
        return 0;
      }

      if (tempA.data != tempB.data) {
        return 0;
      }
      tempA = tempA.next;
      tempB = tempB.next;
    }
  }
}
