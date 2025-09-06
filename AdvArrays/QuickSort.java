package AdvArrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{7,  9 , 4, 1, 5, 3})));
    }

    static int[] quickSort(int[] nums) {
        quickDivide(nums, 0, nums.length - 1);
        return nums;
    }

    static void quickDivide(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            // find partition in left
            quickDivide(nums, low, partitionIndex - 1);
            // find partition in right
            quickDivide(nums, partitionIndex + 1, high);
        }
    }

    static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        // place pivot in correct spot
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }
}
