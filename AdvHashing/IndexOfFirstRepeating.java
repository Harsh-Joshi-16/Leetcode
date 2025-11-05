package AdvHashing;

import java.util.HashSet;

public class IndexOfFirstRepeating {
    public static void main(String[] args) {
        System.out.println(indexOfFirstRepeating(new int[]{1, 5, 3, 4, 3, 5, 6}));
    }

    static int indexOfFirstRepeating(int[] nums) {
        // initialize Set
        HashSet<Integer> set = new HashSet<>();
        int result = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                result = i;
            }

            set.add(nums[i]);
        }

        return result;
    }
}
