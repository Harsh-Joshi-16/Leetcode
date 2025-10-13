package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1, 1, 3, 4, -3}, 5));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        // sort the nums to properly iterate through array
        Arrays.sort(nums);
        // create a list to store all the possible triplets
        List<List<Integer>> finalList = new ArrayList<>();
        // going from 0 index to length - 3 to get rest 3 nums
        for (int first = 0; first < nums.length - 3; first++) {
            // check if there is any duplicate if found skip that element
            if (first > 0 && nums[first] == nums[first - 1]) continue;
            // going from current + 1 till length - 2 to get rest 2 numbers as 2 numbers got from two for loops
            for (int second = first + 1; second < nums.length - 2; second++) {
                // check if there is any duplicate if found skip that element
                if (second > 0 && nums[second] == nums[second - 1]) continue;
                // declare variables
                int left = second + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[first] + nums[second] + nums[left] + nums[right];
                    //check if sum is equal to target
                    if (sum == target) {
                        finalList.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                        // to avoid duplicate array skip the left or right if same element found
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        // move the pointers to next location
                        left++;
                        right--;
                    } else if (sum > target) {
                        // sum is greater than target , decrement the right to smaller number
                        right--;
                    } else {
                        // sum is lesser than target, increment the left to bigger number
                        left++;
                    }
                }
            }
        }

        return finalList;
    }
}
