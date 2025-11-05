package AdvHashing;

import java.util.HashMap;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{10, 5, 2, 7, 1, 9}, 15));
        System.out.println(longestSubarrayMap(new int[]{10, 5, 2, 7, 1, 9}, 15));
    }

    static int longestSubarray(int[] nums, int k) {
        int maxLen = 0;
        // left pointer to be kept at first index and right to be kept moving to find sum
        int left = 0, right = 0;
        int currentSum = 0;
        while (right < nums.length && left < nums.length) {
            if (currentSum == k) {
                maxLen = Math.max(maxLen, right - left);
                currentSum += nums[right];
                right++;
            } else if (currentSum > k) {
                currentSum -= nums[left];
                left++;
            } else {
                currentSum += nums[right];
                right++;
            }
        }

        return maxLen;
    }

    static int longestSubarrayMap(int[] nums, int k) {
        int currentSum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // check if current sum is equal to k then find max length
            if (currentSum == k) {
                maxLen = i + 1;
            }
            // check if the map contains the key of currentSum - target
            if (map.containsKey(currentSum - k)) {
                int prevIndex = map.get(currentSum - k);
                int length = i - prevIndex;
                maxLen = Math.max(maxLen, length);
            }
            // Store first occurrence
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        return maxLen;
    }
}
