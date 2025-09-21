package AdvArrays;

import java.util.Arrays;

public class RotateBy90 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        // first loop is of layer need to go till n/2
        for (int layer = 0; layer < n / 2; layer++) {
            // process the cycle within
            for (int i = layer; i < n - layer - 1; i++) {
                rotateCycle(matrix, layer, i, n);
            }
        }
        return matrix;
    }

    static void rotateCycle(int[][] matrix, int layer, int i, int n) {
        // given n = 3 (2x2 Matrix)
        // temp = 0,0 (for layer 0, i = 0)
        // temp = 0,1 (for layer 0, i = 1)
        int temp = matrix[layer][i];
        // 0,0 = 2,0 (for layer 0, i = 0)
        // 0,1 = 1,1 (for layer 0, i = 1)
        matrix[layer][i] = matrix[n - 1 - i][layer];
        // 2,0 = 2,2 (for layer 0, i = 0)
        // 1,1 = 2,1 (for layer 0, i = 1)
        matrix[n - 1 - i][layer] = matrix[n - 1 - layer][n - 1 - i];
        // 2,2 = 0,2 (for layer 0, i = 0)
        // 2,1 = 1,2 (for layer 0, i = 1)
        matrix[n - 1 - layer][n - 1 - i] = matrix[i][n - 1 - layer];
        // 0,2 = temp (for layer 0, i = 0)
        // 1,2 = temp (for layer 0, i = 1)
        matrix[i][n - 1 - layer] = temp;
    }
}
