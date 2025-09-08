package AdvArrays;

import java.util.Arrays;

public class Shift0s {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{0, 0, 0, 1, 3, -2})));
        System.out.println(Arrays.toString(moveZerosWithWile(new int[]{0, 0, 0, 1, 3, -2})));
    }

    static int[] moveZeros(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }

    static int[] moveZerosWithWile(int[] nums) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
        return nums;
    }
}
