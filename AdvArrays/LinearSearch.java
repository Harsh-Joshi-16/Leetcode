package AdvArrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 3, 5, -4, 1}, 1));
    }

    static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
