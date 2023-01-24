package com.datastructures.trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BinaryTreeTraversals {
  
  public static void printPreOrder(BinaryTreeNode root){
    if (root == null) return;
    System.out.print(root.getData() + "\t");
    printPreOrder(root.getLeft());
    printPreOrder(root.getRight());
  }
  
  public static void printInOrder(BinaryTreeNode root){
    if (root == null) return;
    printInOrder(root.getLeft());
    System.out.print(root.getData() + "\t");
    printInOrder(root.getRight());
  }
  
  public static void printPostOrder(BinaryTreeNode root){
    if (root == null) return;
    printPostOrder(root.getLeft());
    printPostOrder(root.getRight());
    System.out.print(root.getData() + "\t");
  }
  

  public static void printLevelOrder(BinaryTreeNode root) {

    if (root == null) return;

    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      System.out.println(""); 
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        System.out.print("\t" + tempNode.getData());
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
      }
    }
  }
  
  public static void printLevelOrderRightToLeft(BinaryTreeNode root) {

    if (root == null) return;

    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      System.out.println(""); 
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        System.out.print("\t" + tempNode.getData());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
      }
    }
  }
  
  public static void printLevelOrderInReverse(BinaryTreeNode root) {

    if (root == null) return;

    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    Stack<Integer> stack = new Stack<Integer>();

    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      System.out.println(""); 
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        //System.out.print("\t" + tempNode.getData());
        stack.add(tempNode.getData());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
      }
    }
    
    while (!stack.isEmpty())
      System.out.print("\t" + stack.pop());
  }
  
  public static void printZigZagOrder(BinaryTreeNode root) {

    if (root == null) return;
    
    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    boolean leftToRight = false;
    
    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      System.out.println("");
      leftToRight = !leftToRight;
      Stack<Integer> stack = new Stack<Integer>();
      
      while (true) {
        BinaryTreeNode tempNode = queue.remove();
        if (tempNode == null) {
          if (!queue.isEmpty()) queue.add(null);
          break;
        }
        if (leftToRight) 
          System.out.print("\t" + tempNode.getData());
        else 
          stack.push(tempNode.getData());
        if (tempNode.getLeft() != null) queue.add(tempNode.getLeft());
        if (tempNode.getRight() != null) queue.add(tempNode.getRight());
      }
      
      while (!stack.isEmpty())
        System.out.print("\t" + stack.pop());
    }
  }
  
  public static void printInorderNonRecursive(BinaryTreeNode root) {
    if (root == null) return;
    Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
    
    BinaryTreeNode tempNode = null;
    Set<BinaryTreeNode> visitedNodesSet = new HashSet<BinaryTreeNode>(); 
    
    stack.push(root);
    System.out.println("Printing inorder");
    while(!stack.isEmpty()) {
      tempNode = stack.pop();
      
      if(!visitedNodesSet.contains(tempNode) && tempNode.getLeft() != null) {
        stack.push(tempNode);
        stack.push(tempNode.getLeft());
        visitedNodesSet.add(tempNode);
     //   visitedNodesSet.add(tempNode.getLeft());
      } else {
        System.out.print("\t"  + tempNode.getData()); 
        if (tempNode.getRight() != null) 
          stack.push(tempNode.getRight());
      }
    }
  }
  
  public static void printPreorderNonRecursive(BinaryTreeNode root) {
    if (root == null) return;
    Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
    
    BinaryTreeNode tempNode = null;
    stack.push(root);
    
    while(!stack.isEmpty()) {
      tempNode = stack.pop();
        System.out.print(tempNode.getData()  + "\t"); 
        if (tempNode.getRight() != null) 
          stack.push(tempNode.getRight());
        if (tempNode.getLeft() != null) 
          stack.push(tempNode.getLeft());
    }
  }

  public static void printPostorderNonRecursive(BinaryTreeNode root) {
    if (root == null) return;
    Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
    
    BinaryTreeNode tempNode = null;
    Set<BinaryTreeNode> visitedNodesSet = new HashSet<BinaryTreeNode>(); 
    
    stack.push(root);
    
    while(!stack.isEmpty()) {
      tempNode = stack.pop();
      
      if(!visitedNodesSet.contains(tempNode)) {
        stack.push(tempNode);
        visitedNodesSet.add(tempNode);

        if (tempNode.getRight() != null) 
          stack.push(tempNode.getRight());
        if (tempNode.getLeft() != null)
          stack.push(tempNode.getLeft());

      } else {
        System.out.print(tempNode.getData() + "\t"); 
      }
    }
  }
  
}
