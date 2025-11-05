package AdvHashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfNum {
    public static void main(String[] args) {
        System.out.println(findFrequencies(new int[]{1, 1, 2, 2, 3, 3, 3, 4}));
    }

    static Map<Integer, Integer> findFrequencies(int[] nums) {
        // initialize Map
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int num : nums) {
            integerIntegerMap.put(num, integerIntegerMap.getOrDefault(num, 0) + 1);
        }

        return integerIntegerMap;
    }
}
