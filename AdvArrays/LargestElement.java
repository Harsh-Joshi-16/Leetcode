package AdvArrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{-3756, -438, -24, -385, -288, -36}));
        System.out.println(largestElementSortMethod(new int[]{-3756, -438, -24, -385, -288, -36}));
    }

    static int largestElement(int[] nums) {
        int largestNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largestNum) {
                largestNum = num;
            }
        }
        return largestNum;
    }

    static int largestElementSortMethod(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - 1];
    }
}
