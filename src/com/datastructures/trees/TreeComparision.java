package com.datastructures.trees;

public class TreeComparision {
  
  public static boolean areIdentical(BinaryTreeNode root1, BinaryTreeNode root2) {
    
    if (root1 == null && root2 == null) return true;    

    if (root1 == null || root2 == null) return false;    

    boolean leftResult = false;
    boolean rightResult = false;

    leftResult = areIdentical(root1.getLeft(), root2.getLeft());
    rightResult = areIdentical(root1.getLeft(), root2.getLeft());
    
    return rightResult && leftResult;
  }
  
  public static boolean areMirrors(BinaryTreeNode root1, BinaryTreeNode root2) {
    
    if (root1 == null && root2 == null) return true;
    
    if (root1 == null || root2 == null) return false;    

    boolean leftResult = false;
    boolean rightResult = false;

    leftResult = areMirrors(root1.getLeft(), root2.getRight());
    rightResult = areMirrors(root1.getRight(), root2.getLeft());
    
    return rightResult && leftResult;
  }  
}
