package com.datastructures.trees;

public class BuildBinarySearchTree {
  
  public static BinaryTreeNode buildBinarySearchTree(int[] numbers) {
    
    if (numbers == null || numbers.length == 0) return null;
    
    BinaryTreeNode root = new BinaryTreeNode(numbers[0],null, null);
    
    for (int i = 1; i < numbers.length; i++) {
      insertNodeInBST(root, new BinaryTreeNode(numbers[i], null, null));
    }
    return root;
  }
  
  /**
   * Builds Mirror of a BST 
   */
  public static BinaryTreeNode buildMirrorBinarySearchTree(int[] numbers) {
    
    if (numbers == null || numbers.length == 0) return null;
    
    BinaryTreeNode root = new BinaryTreeNode(numbers[0],null, null);
    
    for (int i = 1; i < numbers.length; i++) {
      insertNodeInMirrorBST(root, new BinaryTreeNode(numbers[i], null, null));
    }
    return root;
  }
  
  private static void insertNodeInBST(BinaryTreeNode root, BinaryTreeNode node) {
    
    if (root == null || node == null) return;
    
    if (root.getData() < node.getData()) {
      if (root.getRight() == null){
        root.setRight(node);
        return;
      }
      insertNodeInBST(root.getRight(), node);
    } else if (root.getData() > node.getData()) {
      if (root.getLeft() == null) {
        root.setLeft(node);
        return;
      }
      insertNodeInBST(root.getLeft(), node);
    } else {
      return; // do nothing.
    }
  }
  
  private static void insertNodeInMirrorBST(BinaryTreeNode root, BinaryTreeNode node) {
    
    if (root == null || node == null) return;
    
    if (root.getData() > node.getData()) {
      if (root.getRight() == null){
        root.setRight(node);
        return;
      }
      insertNodeInMirrorBST(root.getRight(), node);
    } else if (root.getData() < node.getData()) {
      if (root.getLeft() == null) {
        root.setLeft(node);
        return;
      }
      insertNodeInMirrorBST(root.getLeft(), node);
    } else {
      return; // do nothing.
    }
  }
}
