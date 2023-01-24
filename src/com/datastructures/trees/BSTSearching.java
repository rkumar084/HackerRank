package com.datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class BSTSearching {
  
  public static int findMin(BinaryTreeNode root) {
    if (root == null) return -1;
    
    if ( root.getLeft() == null) return root.getData();
    
    return findMin(root.getLeft());
  }

  
  public static int findKthSmallest(BinaryTreeNode root, int k) {
      
    List<Integer> list = new ArrayList<Integer>();
    findKthSmallest(root, k, list);
    System.out.println("list size : " + list.size()); 
    return list.get(k-1);
  }
  
  private static void findKthSmallest(BinaryTreeNode root, int k, List list) {
    if (root == null) return;

    findKthSmallest(root.getLeft(), k, list);

    if (list.size() < k)
      list.add((Integer)root.getData());
    else
      return;

    findKthSmallest(root.getRight(), k, list);
  }
  
  
  public static int leastCommonAncestor(BinaryTreeNode root, int num1, int num2) {
    if (root == null) return -1;

    if (root.getData() == num1 || root.getData() == num2) return root.getData();

    if ((root.getData() > num1 && root.getData() < num2)
        || (root.getData() < num1 && root.getData() > num2)) return root.getData();

    if (root.getData() > num1 && root.getData() > num2)
      return leastCommonAncestor(root.getLeft(), num1, num2);

    if (root.getData() < num1 && root.getData() < num2)
      return leastCommonAncestor(root.getRight(), num1, num2);
    return -1;
  }
  
  public static int bestFit(BinaryTreeNode root, int num) {
    if (root == null) return -1;

    if (root.getData() == num) 
      return root.getData();

    if (root.getData() < num) 
      return bestFit(root.getRight(), num);

    int temp = bestFit(root.getLeft(), num);
    return temp == -1 ? root.getData() : temp;
  }
    
  public static void printRange(BinaryTreeNode root, int num1, int num2) {
    if (root == null) return;
    printRange(root.getLeft(), num1, num2);    
    if (root.getData() >= num1 && root.getData() <= num2)
      System.out.print(root.getData() + "\t");
    printRange(root.getRight(), num1, num2);
  }
  
  public static boolean isBST(BinaryTreeNode root) {
    return isBST(root,0,1000);
  }
  
  private static boolean isBST(BinaryTreeNode root, int min, int max) {
    if (root == null) return true;
    
    if (root.getData() < min  || root.getData() > max)
      return false;
    
    return isBST(root.getLeft(), min, root.getData() - 1)
        && isBST(root.getRight(), root.getData() + 1, max);
  }
}
