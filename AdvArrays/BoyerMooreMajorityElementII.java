package AdvArrays;

import java.util.ArrayList;
import java.util.List;

public class BoyerMooreMajorityElementII {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{11, 33, 33, 11, 33, 11}));
    }

    static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE, ct1 = 0, ct2 = 0;
        for (int num : nums) {
            if (ct1 == 0 && num != el2) {
                ct1 = 1;
                el1 = num;
            } else if (ct2 == 0 && num != el1) {
                ct2 = 1;
                el2 = num;
            } else if (num == el1) {
                ct1++;
            } else if (num == el2) {
                ct2++;
            } else {
                ct1--;
                ct2--;
            }
        }

        // verify the nums
        ct1 = 0;
        ct2 = 0;
        for (int num : nums) {
            if (num == el1) ct1++;
            if (num == el2) ct2++;
        }

        int min = nums.length / 3 + 1;
        if (ct1 >= min) list.add(el1);
        if (ct2 >= min && el1 != el2) list.add(el2);
        return list;
    }
}
