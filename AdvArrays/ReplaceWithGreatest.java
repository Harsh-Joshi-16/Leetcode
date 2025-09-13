package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWithGreatest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leaders(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(leadersOptimized(new int[]{17, 18, 5, 4, 6, 1})));
    }

    static int[] leaders(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
            }

            // add the max
            nums[i] = max;
        }

        nums[nums.length - 1] = -1;

        return nums;
    }

    static int[] leadersOptimized(int[] nums) {
        int n = nums.length;
        int maxRight = -1;

        // traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int temp = nums[i];   // store current value
            nums[i] = maxRight;   // replace with max to right
            maxRight = Math.max(maxRight, temp); // update maxRight
        }

        return nums;
    }
}
