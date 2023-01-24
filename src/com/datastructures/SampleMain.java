package com.datastructures;

import com.datastructures.heaps.Heap;
import com.datastructures.heaps.HeapCreation;
import com.datastructures.heaps.HeapSearch;
import com.datastructures.trees.BSTSearching;
import com.datastructures.trees.BinaryTreeNode;
import com.datastructures.trees.BinaryTreeTraversals;
import com.datastructures.trees.BuildBinarySearchTree;

public class SampleMain {

  public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);
    //    int noOfInputs = Integer.parseInt(in.nextLine());


//    int[] numbers = new int[100];
//    numbers[0] = 8; // 3, 10, 1, 6, 14 }; //, 4, 7, 13, 20, 30, 25, 100, 90, 5, 35};
//    
//    Heap heap = new Heap(numbers, 7);
//
//    heap.buildHead();
//    heap.printHeap();
//    heap.replace(5);
//    heap.printHeap();
	  
	  int[] numbers = {5, 3, 50, 2, 16, 1};
	  BinaryTreeNode binaryTreeHead = BuildBinarySearchTree.buildBinarySearchTree(numbers);
	  BinaryTreeTraversals.printLevelOrder(binaryTreeHead);
	  System.out.println("\n\n");
	  BinaryTreeTraversals.printInorderNonRecursive(binaryTreeHead);
  }
}
