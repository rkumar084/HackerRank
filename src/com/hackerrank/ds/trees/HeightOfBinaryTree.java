package com.hackerrank.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

  class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  static int height(Node root) {

    if (root == null) {
      return -1;
    }
    if (root.left == null && root.right == null) {
      return 0;
    }

    Queue q = new LinkedList<Node>();
    q.add(root);
    q.add(null);

    int count = -1;
    while (!q.isEmpty()) {
      Node temp = (Node) q.remove();
      if (temp == null) {
        count++;
        if (!q.isEmpty()) q.add(null);
      } else {
        if (temp.left != null) q.add(temp.left);
        if (temp.right != null) q.add(temp.right);
      }
    }

    return count;
  }
}
