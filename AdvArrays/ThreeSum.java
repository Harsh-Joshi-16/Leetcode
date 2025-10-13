package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, -1, -1, 3, -1}));
    }

    static List<List<Integer>> twoSum(int[] nums) {
        // sort the nums to properly iterate through array
        Arrays.sort(nums);
        // create a list to store all the possible triplets
        List<List<Integer>> finalList = new ArrayList<>();
        for (int current = 0; current < nums.length - 2; current++) {
            // check if the number is repeating number ignore it to avoid duplicate 3 sum array
            if (current > 0 && nums[current] == nums[current - 1]) continue;
            // declare the left and right variables to count sum.
            int left = current + 1, right = nums.length - 1;
            while (left < right) {
                // check if the nums at left and right and current add up to 0
                int sum = nums[current] + nums[left] + nums[right];
                if (sum == 0) {
                    // as the sum is found adding it into the final list array
                    finalList.add(Arrays.asList(nums[current], nums[left], nums[right]));
                    // moving the pointers to their next relevant index
                    left++;
                    right--;
                    // after moving left and right there still can be left and right so need to check and move it to
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    // check if sum is lesser than target then shift to smaller which is towards left
                    left++;
                } else {
                    // the sum is greater than 0 need to find smaller element decrementing from right
                    right--;
                }
            }
        }
        return finalList;
    }
}
