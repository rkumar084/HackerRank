package com.hackerrank.ds.linkedlists;

public class MergeLinkedLists {

  class Node {
    int data;
    Node next;
  }

  Node mergeLists(Node headA, Node headB) {

    if (headA != null && headB == null) {
      return headA;
    } else if (headA == null && headB != null) {
      return headB;
    }

    Node mergeHead = null;
    Node mergeTail = null;
    Node temp = null;
    boolean first = true;

    while (headA != null && headB != null) {

      if (headA.data > headB.data) {
        temp = headB;
        headB = headB.next;
      } else {
        temp = headA;
        headA = headA.next;
      }

      temp.next = null;
      if (first) {
        mergeHead = temp;
        mergeTail = temp;
        first = false;
      } else {
        mergeTail.next = temp;
        mergeTail = temp;
      }
    }

    if (headA != null && headB == null) {
      mergeTail.next = headA;
    } else if (headA == null && headB != null) {
      mergeTail.next = headB;
    }
    return mergeHead;
  }
}
