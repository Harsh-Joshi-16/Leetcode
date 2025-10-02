package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, -1,  -1, 3, -1}));
    }

    static List<List<Integer>> twoSum(int[] nums) {
        // sort the nums to properly iterate through array
        Arrays.sort(nums);
        // create a list to store all the possible triplets
        List<List<Integer>> finalList = new ArrayList<>();
        for (int current = 0; current < nums.length - 2; current++) {
            if (current > 0 && nums[current] == nums[current - 1]) continue; // skip duplicates
            // declare variable left = current + 1, right = nums.size -1
            int left = current + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[current] + nums[left] + nums[right];
                if (sum == 0) {
                    finalList.add(Arrays.asList(nums[current], nums[left], nums[right]));
                    // to avoid duplicate check if the left and current are same then shift to right
                    while (nums[left] == nums[left + 1]) left++;
                    while (nums[right] == nums[right - 1]) right--;
                    left++;
                } else if (sum < 0) {
                    // check if sum is greater than target which is 0 then shift to greater which is towards right
                    left++;
                } else {
                    // check if sum is lesser than target then shift to smaller which is towards left
                    right--;
                }
            }
        }
        return finalList;
    }
}
