package com.algorithms.hashing;

public class SampleMain {

  public static void main(String[] args) {

    //   Finding symmetric pairs in a given set of pairs.
    Pair<Integer>[] pairs = new Pair[9];
    pairs[0] = new Pair(10, 2);
    pairs[1] = new Pair(4, 2);
    pairs[2] = new Pair(12, 2);
    pairs[3] = new Pair(8, 4);    
    pairs[4] = new Pair(3, 3);
    pairs[5] = new Pair(8, 10);
    pairs[6] = new Pair(3, 3);
    pairs[7] = new Pair(4, 8);
    pairs[8] = new Pair(2, 10);
    
    SymmetricPairs.printSymmetricPairs(pairs);
  }
}
