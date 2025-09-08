package AdvArrays;

import java.util.Arrays;

public class RotateLeftBy1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{10, 2, 3, 4, 5})));
    }

    static int[] rotateArray(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;

        return nums;
    }
}
