package com.hackerrank.ds.trees;

public class BinarySearchTreeInsertion {

  class Node {
    int data;
    Node left;
    Node right;
  }

  private Node insert(Node root, int value) {

    if (root == null) {
      Node node = new Node();
      node.data = value;
      return node;
    }

    if (root.data < value) {
      if (root.right == null) {
        Node node = new Node();
        node.data = value;
        root.right = node;
      } else {
        insert(root.right, value);
      }
    } else if (root.data > value) {
      if (root.left == null) {
        Node node = new Node();
        node.data = value;
        root.left = node;
      } else {
        insert(root.left, value);
      }
    }
    return root;
  }
}
