package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElementWithSign {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{2, 4, 5, -1, -3, -4})));
    }

    static int[] rearrangeArray(int[] nums) {
        // need to keep track of positive and negative ints
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();
        // separating them in list
        for (int n : nums) {
            if (n > 0) {
                positiveList.add(n);
            } else {
                negativeList.add(n);
            }
        }
        // declaring vars to track nums inserted in both list
        int left = 0, right = 0;
        // using both list to add them in same array alternatively
        for (int i = 0; i < nums.length; i++) {
            // inserting +ve at even indexes
            if (i % 2 == 0) {
                nums[i] = positiveList.get(left);
                left++; // as now next element need to be considered to add
            } else {
                nums[i] = negativeList.get(right);
                right++;
            }
        }

        return nums;
    }
}
