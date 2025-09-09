package AdvArrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    static int maxArea(int[] nums) {
        int left = 0, max = 0, right = nums.length - 1;
        while (left < right) {
            // max holding capacity is height * width;
            // so height is given in array , so if left -> 1, and right -> 8 taking 1 as it will overflow if water rises above left.
            // so width is distance between two indexes.
            int area = Math.min(nums[left], nums[right]) * (right - left);
            max = Math.max(max, area);
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
