package AdvArrays;

import java.util.Arrays;

public class RotateLeftByK {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{3, 4, 1, 5, 3, -5}, 2)));
    }

    static int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;
        if (k != 0) {
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, nums.length - 1);
            reverseArray(nums, 0, nums.length - 1);
        }
        return nums;
    }

    static void reverseArray(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
