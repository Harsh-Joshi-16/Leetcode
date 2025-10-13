package AdvArrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, -3, -7, -2, -10, -4}));
    }

    static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // traverse through list of sums
        for (int i = 0; i < nums.length; i++) {
            // check if after adding the nums the currentSum is going below 0
            currentSum += nums[i];
            // check for the max sum
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        return maxSum;
    }
}
