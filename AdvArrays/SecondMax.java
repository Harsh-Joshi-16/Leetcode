package AdvArrays;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{-235, -535, -457, -35, -568, -456, -3}));
    }

    static int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
