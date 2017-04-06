package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/*A queen is standing on an  chessboard. The chessboard's rows are numbered from  to ,
going from bottom to top; its columns are numbered from  to , going from left to right.
Each square on the board is denoted by a tuple, , describing the row, , and column, ,
where the square is located.

The queen is standing at position  and, in a single move, she can attack any square in any of
the eight directions (left, right, up, down, or the four diagonals). In the diagram below, the green
circles denote all the cells the queen can attack from :

There are  obstacles on the chessboard preventing the queen from attacking any square that has an
obstacle blocking the the queen's path to it. For example, an obstacle at location  in the diagram
above would prevent the queen from attacking cells , , and :

Given the queen's position and the locations of all the obstacles, find and print the number of
squares the queen can attack from her position at .

Input Format
   The first line contains two space-separated integers describing the respective values of
    (the side length of the board) and  (the number of obstacles). The next line contains two
    space-separated integers describing the respective values of  and , denoting the position of the queen.
    Each line  of the  subsequent lines contains two space-separated integers describing the respective
    values of and , denoting the position of obstacle .

Output Format
    Print the number of squares that the queen can attack from position .
*/
public class QueensAttack2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int k = in.nextInt();

    int rQueen = in.nextInt();
    int cQueen = in.nextInt();

    HashMap<String, Integer> obstacleMap = new HashMap<>();

    for (int a0 = 0; a0 < k; a0++) {
      int row = in.nextInt();
      int col = in.nextInt();
      obstacleMap.put("" + row + col, col);
    }
    in.close();

    long attackCount = 0;
    // count of horizontal and vertical directions
    attackCount = attackCount + (n - 1) * 2;

    // Direction : Row and col increase.
    if (rQueen >= cQueen) {
      attackCount = attackCount + (n - rQueen);
    } else {
      attackCount = attackCount + (n - cQueen);
    }

    // Direction : Row and col decrease.
    if (rQueen >= cQueen) {
      attackCount = attackCount + (cQueen - 1);
    } else {
      attackCount = attackCount + (rQueen - 1);
    }

    // Direction : Row increase and col decrease.
    if ((n - rQueen) >= (cQueen - 1)) {
      attackCount = attackCount + (cQueen - 1);
    } else {
      attackCount = attackCount + (n - rQueen);
    }

    // Direction : Row decrease and col increase.
    if ((n - cQueen) >= (rQueen - 1)) {
      attackCount = attackCount + (rQueen - 1);
    } else {
      attackCount = attackCount + (n - cQueen);
    }

    for (Entry<String, Integer> entry : obstacleMap.entrySet()) {
      String key = entry.getKey();
      int col = entry.getValue();
      int rowNumberLen = key.length() - (col + "").length();
      int row = Integer.parseInt(key.substring(0, rowNumberLen));

      System.out.println(row + " " + col);
      
      if (row == rQueen) {
        if (col < cQueen) {
          attackCount = attackCount - col;
        } else {
          attackCount = attackCount - (n - col + 1);
        }
      } else if (col == cQueen) {
        if (row < rQueen) {
          attackCount = attackCount - row;
        } else {
          attackCount = attackCount - (n - row + 1);
        }
      } else if ((row - rQueen) == (col - cQueen)) {
        if (row > rQueen) {
          attackCount = attackCount - (n - Math.max(row, col) + 1);
        } else {
          attackCount = attackCount - (Math.min(row, col));
        }
      } else if ((row - rQueen) == -(col - cQueen)) {
        if (row > rQueen) {
          attackCount = attackCount - (Math.min(n - row + 1, col));
        } else {
          attackCount = attackCount - (Math.min(n - col + 1, row));
        }
      }
    }
    System.out.println(attackCount);
  }
}
