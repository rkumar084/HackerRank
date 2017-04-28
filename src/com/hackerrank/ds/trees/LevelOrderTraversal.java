package com.hackerrank.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
  class Node {
    int data;
    Node left;
    Node right;
  }

  void levelOrderTraversal(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<Node>();

    queue.add(root);
    queue.add(null);

    StringBuilder output = new StringBuilder();
    boolean first = true;
    while (!queue.isEmpty()) {
      Node tempNode = queue.remove();
      if (tempNode == null) {
        if (!queue.isEmpty()) queue.add(null);
      } else {

        if (first) {
          first = false;
        } else {
          output.append(" ");
        }
        output.append(tempNode.data);
        if (tempNode.left != null) queue.add(tempNode.left);
        if (tempNode.right != null) queue.add(tempNode.right);
      }
    }
    System.out.println(output.toString());
  }
}
