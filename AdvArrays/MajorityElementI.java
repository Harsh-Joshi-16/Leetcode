package AdvArrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementI {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{4, 5, 5}));
    }

    static int majorityElement(int[] nums) {
        // map to store the count of the elements
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.getOrDefault(num, 0) >= nums.length / 2) {
                return num;
            }
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        return 0;
    }
}
