package com.hackerrank.algorithms.search;

import java.util.Scanner;
import java.util.Stack;

// Solution for problem at https://www.hackerrank.com/challenges/connected-cell-in-a-grid
public class ConnectedCells {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int cols = in.nextInt();

    Integer[][] matrix = new Integer[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int num = in.nextInt();
        matrix[i][j] = num;
      }
    }
    in.close();

    int maxRegionSize = 0;
    int r = 0, c = 0;

    while (true) {
      String unmarkedCell = getNextUnmarkedCell(matrix, cols);
      if (unmarkedCell == null) {
        break;
      }
      String[] cellArr = unmarkedCell.split(" ");
      r = Integer.parseInt(cellArr[0]);
      c = Integer.parseInt(cellArr[1]);

      int regionSize = getRegionSize(matrix, cols, r, c);
      if (regionSize > maxRegionSize) {
        maxRegionSize = regionSize;
      }
    }
    System.out.println(maxRegionSize);
  }

  private static String getNextUnmarkedCell(Integer[][] matrix, int cols) {
    String result = null;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 1) {
          return result = i + " " + j;
        }
      }
    }
    return result;
  }

  private static int getRegionSize(
      Integer[][] matrix, int noOfcols, int i, int j) {
    int count = 0;
    Stack<String> adjCells = new Stack();
    int noOfRows = matrix.length;

    adjCells.push(i + " " + j);

    while (!adjCells.isEmpty()) {

      String cell = adjCells.pop();
      String[] cellArr = cell.split(" ");
      int r = Integer.parseInt(cellArr[0]);
      int c = Integer.parseInt(cellArr[1]);

      if (matrix[r][c] != -1) {
        count++;
        matrix[r][c] = -1;
      }

      // left
      if ((r + 1 < noOfRows) && (c < noOfcols) && (matrix[r + 1][c] == 1)) {
        adjCells.push((r + 1) + " " + c);
      }
      // right
      if (r != 0 && (r - 1 < noOfRows) && (c < noOfcols) && (matrix[r - 1][c] == 1)) {
        adjCells.push((r - 1) + " " + c);
      }
      // up
      if ((r < noOfRows) && c != 0 && (c - 1 < noOfcols) && (matrix[r][c - 1] == 1)) {
        adjCells.push(r + " " + (c - 1));
      }
      // down
      if ((r < noOfRows) && (c + 1 < noOfcols) && (matrix[r][c + 1] == 1)) {
        adjCells.push(r + " " + (c + 1));
      }
      // Top Right
      if (r != 0 && (r - 1 < noOfRows) && (c + 1 < noOfcols) && (matrix[r - 1][c + 1] == 1)) {
        adjCells.push((r - 1) + " " + (c + 1));
      }
      // Top left
      if ((r != 0 && r - 1 < noOfRows)
          && c != 0
          && (c - 1 < noOfcols)
          && (matrix[r - 1][c - 1] == 1)) {
        adjCells.push((r - 1) + " " + (c - 1));
      }
      // Bottom right
      if ((r + 1 < noOfRows) && (c + 1 < noOfcols) && (matrix[r + 1][c + 1] == 1)) {
        adjCells.push((r + 1) + " " + (c + 1));
      }
      // Bottom left
      if ((r + 1 < noOfRows) && c != 0 && (c - 1 < noOfcols) && (matrix[r + 1][c - 1] == 1)) {
        adjCells.push((r + 1) + " " + (c - 1));
      }
    }

    return count;
  }
}
