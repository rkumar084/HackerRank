package com.datastructures.trees;

public class AncestorRelated {
  
  public static boolean allAncestorsOfANode(BinaryTreeNode root, BinaryTreeNode node) {
    
    if (root == null || node == null) return false;
    
    if (root.getData() == node.getData())
      return true;
    
    if (allAncestorsOfANode(root.getLeft(), node)) {
      System.out.println(root.getData() + ""); 
      return true;
    } else if (allAncestorsOfANode(root.getRight(), node)) {
      System.out.println(root.getData() + ""); 
      return true;
    }
    return false;
  }
  
  public static int veriticalSum(BinaryTreeNode root, BinaryTreeNode node) {
    
    if (root == null || node == null) return -1;
    
    if (root.getData() == node.getData())
      return root.getData();
    
    int sum = 0;
    
    sum = veriticalSum(root.getLeft(), node);
    if (sum > -1)
      return sum + root.getData();

    sum = veriticalSum(root.getRight(), node);
    if (sum > -1)
      return sum + root.getData();

    return -1;
  }
  
  public static void printAllRootToLeafPaths(BinaryTreeNode root, String path) {
   if (root == null) 
     return;
   
   if (root.getLeft() == null && root.getRight() == null) {
     System.out.println(path + "-->" + root.getData()); 
     return;
   }
   
   printAllRootToLeafPaths(root.getLeft(), path + "-->" + root.getData());
   printAllRootToLeafPaths(root.getRight(), path + "-->"  + root.getData());
   
  }  
}


