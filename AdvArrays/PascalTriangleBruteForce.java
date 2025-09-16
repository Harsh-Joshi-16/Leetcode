package AdvArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleBruteForce {
    public static void main(String[] args) {
        System.out.println(pascalTriangle(3, 2));
    }

    static int pascalTriangle(int r, int c) {
        if (r == 1) return 1;
        // list to store previous element
        List<Integer> previous = List.of(1);
        for (int row = 1; row <= r; row++) {
            List<Integer> current = new ArrayList<>();
            // For each row, start COL from 0 (to build all positions)
            for (int col = 0; col < row; col++) {
                int left = (col - 1 >= 0) ? previous.get(col - 1) : 0;
                int right = (col < previous.size()) ? previous.get(col) : 0;
                current.add(left + right);
            }
            previous = current;
        }
        return previous.get(c - 1);
    }
}
