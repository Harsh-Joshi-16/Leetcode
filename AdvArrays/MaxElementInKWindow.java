package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxElementInKWindow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    static int[] maxWindow(int[] nums, int k) {
        List<Integer> maxIntegers = new ArrayList<>();
        // finding max in first k element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
        }
        maxIntegers.add(max);

        // finding max in all array from k-1 to nums.length - 1
        for (int right = k; right < nums.length; right++) {
            int left = right - k + 1;
            max = Integer.MIN_VALUE;
            for (int i = left; i <= right; i++) {
                max = Math.max(max, nums[i]);
            }
            maxIntegers.add(max);
        }

        return maxIntegers.stream().mapToInt(Integer::intValue).toArray();
    }
}
