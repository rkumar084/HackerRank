package com.datastructures.trees;

public class CreateMirror {
  public static void createMirror (BinaryTreeNode root) {
    if (root == null) return;
    
    if (root.getLeft() == null && root.getRight() == null)
      return;
    
    BinaryTreeNode temp = null;
    temp = root.getLeft();
    root.setLeft(root.getRight());
    root.setRight(temp);
    
    createMirror(root.getLeft());
    createMirror(root.getRight());    
  }
}
