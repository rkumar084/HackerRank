package com.hackerrank.ds.trees;

public class TopViewOfTree {

  class Node {
    int data;
    Node left;
    Node right;
  }

  void topView(Node root) {
    StringBuilder output = new StringBuilder();

    if (root == null) return;

    Node temp = root;
    while (temp != null) {
      String suffix = output.toString();
      output.setLength(0);

      output.append(temp.data);
      if (suffix.length() != 0) {
        output.append(" ");
      }
      output.append(suffix);
      temp = temp.left;
    }

    temp = root.right;
    while (temp != null) {
      output.append(" " + temp.data);
      temp = temp.right;
    }

    System.out.println(output);
  }
}
