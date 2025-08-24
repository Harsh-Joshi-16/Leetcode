package Basics.Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndLowestFrequencies {
    public static int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // max frequency
        int max = 0;
        for(int num: frequencyMap.values()){
            max = Collections.max(frequencyMap.values());
        }

        int min = 1;
        for(int num: frequencyMap.values()){
            min = Collections.min(frequencyMap.values());
        }

        return max + min;
    }

    public static void main(String[] args) {
        System.out.println(sumHighestAndLowestFrequency(new int[]{7,7,7,8,8,8}));
    }
}
