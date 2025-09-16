package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    static List<Integer> spiralOrder(int[][] nums) {
        // list to add numbers
        List<Integer> list = new ArrayList<>();
        // declaring variables to interate over 2d matrix
        int top = 0; // start of top column;
        int bottom = nums.length - 1; // start of the bottom index
        int left = 0; // start of left
        int right = nums[0].length - 1; // start of right for columns

        // iterate over 2d matrix
        // why below
        while (top <= bottom && left <= right) {
            // 1st iteration where going from top,left to top,right (0,0 --> 0,nums[0].length - 1)
            for (int col = left; col <= right; col++) {
                list.add(nums[top][col]);
            }
            // incrementing top as we now have considered all the element in top
            top++;
            // 2nd iteration is going from top,right to bottom,right (1,nums[0].length - 1 --> nums.length,nums[0].length)
            // here we have already considered 0,nums[0].length - 1 so starting from 1,nums[0].length - 1 which is current top
            for (int row = top; row <= bottom; row++) {
                list.add(nums[row][bottom]);
            }
            // we have considered all the element of the right from top to bottom shrink it
            right--;
            // 3rd iteration is going from bottom,right to bottom,left (nums[0].length - 1, nums.length - 2 --> nums[0].length - 1, 0)
            // why nums.length -2 because we already considered the element nums.length - 1 in top to bottom flow which is already handled in right--
            // check if there is col to check or not i.e. is there any col left to traverse then only do
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    list.add(nums[bottom][col]);
                }
                // we have considered all the elements of bottom decrementing it
                bottom--;
            }
            // 4th iteration is going from bottom,left --> top,left (nums[0].length - 2, 0 --> top, 0)
            // same here too nums[0].length - 2 as nums[0].length - 1 is considered in bottom, right -> bottom, left
            // check if there is any row to iterate or go backward
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(nums[row][left]);
                }
                left++;
            }
        }

        return list;
    }
}
