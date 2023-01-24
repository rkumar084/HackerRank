package com.algorithms.hashing;

public class Pair<K> {
  private K value1;
  private K value2;
  
  public Pair(K value1, K value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  public K getValue1() {
    return value1;
  }

  public void setValue1(K value1) {
    this.value1 = value1;
  }

  public K getValue2() {
    return value2;
  }

  public void setValue2(K value2) {
    this.value2 = value2;
  }

  public String toString() {
    return value1.toString() + "-->" + value2.toString();
  }
}
