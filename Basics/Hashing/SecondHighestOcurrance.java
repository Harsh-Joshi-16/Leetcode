package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOcurrance {
    public static int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> frequnceyMap = new HashMap<>();
        for (int num : nums) {
            frequnceyMap.put(num, frequnceyMap.getOrDefault(num, 0) + 1);
        }

        int secondMax = 0;
        int mostFrequentKey = nums[0];
        for (Map.Entry<Integer, Integer> map : frequnceyMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(secondMostFrequentElement(new int[]{1, 1, 1, 2, 2, 3, 3}));
    }
}
