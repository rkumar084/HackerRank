package com.datastructures.heaps;

public class HeapCreation {
  
  public static void buildHead(int[] heap) {
    //  Assuming first element is dummy.
    int size = heap.length -1;
    if (size < 3)
      return;
    
    for (int i = size/2 ; i > 0; i --)
      heapify(heap, i);
  }
  
  public static void heapify(int[] heap, int index){
    //  Assuming first element is dummy.
    int size = heap.length -1;
    if (size < 2)
      return;
    
    int maxIndex = index;
    //2*index+1 < heap.length && 
    if (2*index + 1 > size)
      maxIndex = 2*index;
    else if (heap[2*index] < heap[2*index+1]) 
      maxIndex = 2*index + 1;
    else 
     maxIndex = 2*index;
    
    if (heap[index] > heap[maxIndex])
      maxIndex = index;
    
    if (maxIndex != index) {
      int temp = heap[index];
      heap[index] = heap[maxIndex];
      heap[maxIndex] = temp;
      if (maxIndex <= size/2) 
        heapify(heap, maxIndex);
    }
  }
  
  public static void printHeap(int[] heap) {
    //  Assuming first element is dummy.
    int level = 0;
    for (int i=1; i < heap.length; i++) {
      if(i == (int)Math.pow(2, level)) {
        level++;
        System.out.println(""); 
      }
      System.out.print(heap[i] + "\t" );
    }
  }
}

