package AdvArrays;

public class SlidingWindow {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    static int maxSum(int[] nums, int k) {
        int maxSum = 0, windowSum = 0, left = 0;
        for (int read = 0; read < nums.length; read++) {
            windowSum += nums[read];

            if (read - left + 1 > k) {
                windowSum -= nums[left];
                left++;
            }

            if (read - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}
