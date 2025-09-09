package AdvArrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeElement(new int[]{3, 2, 2, 3}, 3)));
    }

    static int[] removeElement(int[] nums, int val) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }
        return nums;
    }
}
