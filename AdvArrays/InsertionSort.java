package AdvArrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{5, 4, 4, 1,})));
    }

    static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        return nums;
    }
}
