package com.hackerrank.algorithms.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/gridland-metro
public class GridLand {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String firstLine = in.nextLine();
    String[] firstLineArr = firstLine.split(" ");

    long rows = Integer.parseInt(firstLineArr[0]);
    long cols = Integer.parseInt(firstLineArr[1]);
    int noOfPaths = Integer.parseInt(firstLineArr[2]);

    String[] paths = new String[noOfPaths];

    for (int i = 0; i < noOfPaths; i++) {
      paths[i] = in.nextLine();
    }
    in.close();

    // Merge all overlapping tracks
    Map<Integer, String> tracksMap = new HashMap<>();
    for (int i = 0; i < noOfPaths; i++) {
      String[] track = paths[i].split(" ");

      Integer row = Integer.parseInt(track[0]);
      int startCol = Integer.parseInt(track[1]);
      int endCol = Integer.parseInt(track[2]);

      if (tracksMap.containsKey(row)) {

        String cell = tracksMap.get(row);
        String[] cellArr = cell.split(" ");
        int newStartCol = Math.min(startCol, Integer.parseInt(cellArr[0]));
        int newEndCol = Math.max(endCol, Integer.parseInt(cellArr[1]));
        tracksMap.put(row, newStartCol + " " + newEndCol);
      } else {
        tracksMap.put(row, startCol + " " + endCol);
      }
    }
    
    //BigInteger totalCells = BigInteger(rows * cols);
    long totalCells = rows * cols;
    long tackCellsCount = 0;
    for (Map.Entry<Integer, String> entry : tracksMap.entrySet()) {
      String[] cell = entry.getValue().split(" ");
      int startCol = Integer.parseInt(cell[0]);
      int endCol = Integer.parseInt(cell[1]);
      tackCellsCount = tackCellsCount + (endCol - startCol) + 1;
    }
    System.out.println(totalCells - tackCellsCount);
  }
}
