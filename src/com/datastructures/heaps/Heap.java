package com.datastructures.heaps;

public class Heap {
  private int[] elements;
  private int size;

  public Heap(int[] elements) {
    this.elements = elements;
    this.size = elements.length - 1;
  }
  
  public Heap(int[] elements, int size) {
    this.elements = elements;
    this.size = size;
  }

  public void buildHead() {

    if (size < 1) return;

    for (int i = size / 2; i > 0; i--) 
      heapify(i);
  }

  public void heapify(int index) {

    if (size < 2) return;

    int maxIndex = index;
    //2*index+1 < heap.length &&
    if (2 * index + 1 > size) 
      maxIndex = 2 * index;
    else if (elements[2 * index] < elements[2 * index + 1]) 
      maxIndex = 2 * index + 1;
    else 
      maxIndex = 2 * index;

    if (elements[index] > elements[maxIndex]) 
      maxIndex = index;

    if (maxIndex != index) {
      int temp = elements[index];
      elements[index] = elements[maxIndex];
      elements[maxIndex] = temp;
      if (maxIndex <= size / 2) 
        heapify(maxIndex);
    }
  }

  public void printHeap() {
    //  Assuming first element is dummy.
    int level = 0;
    System.out.println("\n================ Heap Start================" ); 
    for (int i = 1; i <= size; i++) {
      if (i == (int) Math.pow(2, level)) {
        level++;
        System.out.println("");
      }
      System.out.print(elements[i] + "\t");
    }
    System.out.println("\n================ Heap End================" );
  }

  public void allValuesLessThan(int key) {

    if (size < 1) return;

    allValuesLessThan(key, 1);
  }

  private void allValuesLessThan(int key, int nodeIndex) {

    if (size < nodeIndex) return;

    if (elements[nodeIndex] <= key) {
      printSubHeap(nodeIndex);
      return;
    }
    allValuesLessThan(key, 2 * nodeIndex);
    allValuesLessThan(key, 2 * nodeIndex + 1);
  }

  private void printSubHeap(int nodeIndex) {
    if (size < nodeIndex) return;

    System.out.println(elements[nodeIndex]);
    printSubHeap(2 * nodeIndex);
    printSubHeap(2 * nodeIndex + 1);
  }
  
//  public int pop() {
//    if (size < 1) 
//      return -1;
//    
//    int max = elements[1];
//    elements[1] = elements[size];
//    elements[size] = max;
//    size --;
//    heapify(1);
//    return max;    
//  }
  
  public int pop() {
    if (size < 1) 
      return -1;
    return delete(1);
  }
  
  public int delete(int index) {
    if (size < 1) 
      return -1;
    
    int max = elements[index];
    elements[index] = elements[size];
    elements[size] = max;
    size --;
    heapify(index);
    return max;    
  }
  
  public void replace(int num) {
    if (size < 1) 
      return;

    elements[1] = num;
    heapify(1);    
  }
  
  public int size() {
    return size;
  }
  
  public int[] getElements() {
    return elements;
  }
  
  public void heapSort() {
    int heapsize = size();
    for (int i = 1; i <= heapsize; i ++) {
      System.out.println("---" + pop());    
    }
  }
  
  public void push (int num) {
    
    // Assuming heap array has enough size.
    size ++;
    elements[size] = num;
    percolateUp(size);
  }  
  
  private void percolateUp(int index) {
    if (index < 2)
      return;
    if (elements[index] > elements[index/2]) {
      int temp = elements[index];
      elements[index] = elements[index/2];
      elements[index/2] = temp;
      percolateUp(index/2);
    }    
  }
}
