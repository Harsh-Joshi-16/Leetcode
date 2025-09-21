package AdvArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalRowList {
    public static void main(String[] args) {
        System.out.println(pascalTriangleIII(4));
    }

    static List<List<Integer>> pascalTriangleIII(int n) {
        // List to contain all rows info.
        List<List<Integer>> finalList = new ArrayList<>();
        // iterate from 1 -> n
        for (int row = 1; row <= n; row++) {
            // generate list of each index and add in finalList
            List<Integer> elementOfEachRow = new ArrayList<>();
            int current = 1;
            //iterating for each row to generate col from 0 to n-1/2
            for (int col = 0; col <= (row - 1) / 2; col++) {
                elementOfEachRow.add(current);
                // calculating next current
                current = current * (row - 1 - col) / (col + 1);
            }

            // Mirror the first half (excluding middle for odd-length rows)
            for (int col = (row - 2) / 2; col >= 0; col--) {
                elementOfEachRow.add(elementOfEachRow.get(col));
            }

            finalList.add(elementOfEachRow);
        }
        return finalList;
    }

    static List<Integer> generatePascalRow(int num) {
        // list to store the rows data
        int current = 1;
        int[] pascalArray = new int[num];
        // going till n/2 becuase last elements are mirror elements
        for (int i = 0; i <= (num - 1) / 2; i++) {
            pascalArray[i] = current;
            pascalArray[num - i - 1] = current;
            // now change the current to point to next element
            if (i < num / 2) {
                // so here the formula will be current which will be 1 for C(5,0) and multiply it by
                // 5-1 / 1 for C(5,1) = 4 i.e C(5,1) = 4
                current = current * (num - i - 1) / (i + 1);
            }
        }

        // Convert manually:
        List<Integer> result = new ArrayList<>();
        for (int val : pascalArray) {
            result.add(val);  // Auto-boxing int to Integer
        }
        return result;
    }
}
