package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOcurrance {
    public static int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 1: find max frequency
        int max = 0;
        for (int freq : frequencyMap.values()) {
            max = Math.max(max, freq);
        }

        // Step 2: find the highest frequency less than max (secondMax)
        int secondMax = 0;
        for (int freq : frequencyMap.values()) {
            if (freq < max) {
                secondMax = Math.max(secondMax, freq);
            }
        }

        // Step 3: if no secondMax found → return -1
        if (secondMax == 0) {
            return -1;
        }

        // Step 4: among numbers with frequency = secondMax, pick the smallest key
        int secondMostFrequentKey = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == secondMax) {
                secondMostFrequentKey = Math.min(secondMostFrequentKey, entry.getKey());
            }
        }

        return secondMostFrequentKey;
    }

    public static void main(String[] args) {
        System.out.println(secondMostFrequentElement(new int[]{4, 4, 5, 5, 6, 7}));
    }
}
