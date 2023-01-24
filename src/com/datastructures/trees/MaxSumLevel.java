package com.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSumLevel {
  
  public static int levelWithMaxSum(BinaryTreeNode root) {

    if (root == null) return -1;

    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    int maxSumLevel = 0;
    int maxSum = 0;
    int currentLevel = 0;
    
    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      int sum = 0;
      currentLevel ++;
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          if (maxSum < sum) {
            maxSum = sum;
            maxSumLevel = currentLevel;
          }
          break;
        }
        sum = sum + tempNode.getData();
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
      }
    }
    return maxSumLevel;
  }
}

