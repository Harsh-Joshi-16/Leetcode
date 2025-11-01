package AdvArrays;

public class MaxProductSubArrayInArray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-5, 0, -2}));
    }

    static int maxProduct(int[] nums) {
        int result = nums[0], max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // track the temp max so that we never loose the max
            int tempMax = max;
            // now find the max after multiplying the both max and min
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            // also keep finding the min so the -ve  * -ve might become +ve which is greater
            min = Math.min(nums[i], Math.min(max * nums[i], min * nums[i]));
            // result
            result = Math.max(result, min);
        }

        return result;
    }
}
