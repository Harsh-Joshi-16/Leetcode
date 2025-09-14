package AdvArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        System.out.println(leaders(new int[]{1, 2, 5, 3, 1, 2}));
    }

    static List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            max = Math.max(max, nums[i]);
            if (!list.contains(max)) {
                list.add(max);
            }
        }

        Collections.reverse(list);
        return list;
    }
}
