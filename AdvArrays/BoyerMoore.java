package AdvArrays;

public class BoyerMoore {
    public static void main(String[] args) {
        System.out.println(boyerMoore(new int[]{7, 0, 0, 1, 7, 7, 2, 7, 7}));
        System.out.println(boyerMoore(new int[]{1, 2, 3, 4, 5}));
    }

    static int boyerMoore(int[] nums) {
        int element = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        // to handle edge case if there are no majority element
        int freq = 0;
        for (int num : nums) {
            if (num == element) freq++;
        }
        return freq > nums.length / 2 ? element : -1;
    }
}
