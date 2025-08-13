package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurrence {
    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> frequnceyMap = new HashMap<>();
        for (int num : nums) {
            frequnceyMap.put(num, frequnceyMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = nums[0]; // Assume first element initially
        for (Map.Entry<Integer, Integer> entry : frequnceyMap.entrySet()) {
            if (entry.getValue() > maxCount ||
                    (entry.getValue() == maxCount && entry.getKey() < mostFrequent)) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        System.out.println(HighestOccurrence.mostFrequentElement(new int[]{10000, 10000, 9999, 9999}));
    }
}
