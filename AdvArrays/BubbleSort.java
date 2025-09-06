package AdvArrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{7, 4, 1, 5, 3})));
    }

    static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
