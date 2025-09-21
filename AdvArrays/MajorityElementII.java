package AdvArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        System.out.println(majorityElementTwo(new int[]{1, 2, 1, 1, 3, 2, 2}));
    }

    static List<Integer> majorityElementTwo(int[] nums) {
        // list to store values
        List<Integer> majorityNums = new ArrayList<>();
        // Map to store values frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 3 && !majorityNums.contains(num)) {
                majorityNums.add(num);
            }
        }
        return majorityNums;
    }
}
