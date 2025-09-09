package AdvArrays;

import java.util.Arrays;

public class SortFlag {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{2, 0, 2, 1, 1, 0})));
        System.out.println(Arrays.toString(sortFlag3Pointers(new int[]{2, 0, 2, 1, 1, 0})));
    }

    static int[] sortColors(int[] nums) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] == 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        for (int read = 0; read < nums.length; read++) {
            if (nums[read] == 1) {
                nums[write] = nums[read];
                write++;
            }
        }

        for (int i = write; i < nums.length; i++) {
            nums[i] = 2;
        }

        return nums;
    }

    static int[] sortFlag3Pointers(int[] nums) {
        int left = 0, current = 0, right = nums.length - 1;
        while (current <= right) {
            if (nums[current] == 0) {
                int temp = nums[current];
                nums[current] = nums[left];
                nums[left] = temp;
                current++;
                left++;
            } else if (nums[current] == 2) {
                int temp = nums[current];
                nums[current] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                current++;
            }
        }

        return nums;
    }
}
