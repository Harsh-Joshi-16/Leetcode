package AdvArrays;

import java.util.Arrays;

public class PascalTriangleRow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalTriangleII(5)));
    }

    static int[] pascalTriangleII(int num) {
        // intialzing current to 1
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

        return pascalArray;
    }
}
