package com.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {

  public static BinaryTreeNode deepestNode(BinaryTreeNode root) {
    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    BinaryTreeNode deepestNode = null;

    if (root == null) return null;

    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        deepestNode = tempNode;
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
      }
    }
    return deepestNode;
  }
}
