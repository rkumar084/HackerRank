package com.datastructures.heaps;

public class HeapSearch {
  
  public static void allValuesLessThan(int[] heap, int key) {
    
    if (heap.length < 2)
      return;
    allValuesLessThan(heap, key, 1);

    
  }
  
  private static void allValuesLessThan(int[] heap, int key, int nodeIndex) {
    
    if (heap.length <= nodeIndex)
      return;
    
    if (heap[nodeIndex] <= key){
      printSubHeap(heap, nodeIndex);
      return;
    }
    allValuesLessThan(heap, key, 2*nodeIndex);
    allValuesLessThan(heap, key, 2*nodeIndex + 1);
  }
  
  private static void printSubHeap (int[] heap, int nodeIndex) {
    if (heap.length <= nodeIndex)
      return;

    System.out.println( heap[nodeIndex]);
    printSubHeap(heap, 2*nodeIndex);
    printSubHeap(heap, 2*nodeIndex + 1);
  }

}

