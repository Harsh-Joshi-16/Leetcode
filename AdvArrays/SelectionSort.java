package AdvArrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{5, 4, 4, 1, 1})));
    }

    static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // swap once per iteration
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}
