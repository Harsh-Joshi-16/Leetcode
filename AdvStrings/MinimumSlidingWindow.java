package AdvStrings;

import java.util.HashMap;
import java.util.Map;

public class MinimumSlidingWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    static String minWindow(String s, String t) {
        int left = 0, minLen = Integer.MAX_VALUE;
        String result = "";
        for (int right = 0; right < s.length(); right++) {
            String currentWindow = s.substring(left, right + 1);
            while (containsAll(currentWindow, t)) {
                if (currentWindow.length() < minLen) {
                    minLen = currentWindow.length();
                    result = currentWindow;
                }

                left++;
                if (left <= right) {
                    currentWindow = s.substring(left, right + 1);
                }
            }
        }

        return result;
    }

    static boolean containsAll(String c, String t) {
        // Count what target needs
        Map<Character, Integer> targetCount = new HashMap<>();
        for (char ch : t.toCharArray()) {
            targetCount.put(ch, targetCount.getOrDefault(ch, 0) + 1);
        }

        // Count what window has
        Map<Character, Integer> windowCount = new HashMap<>();
        for (char ch : c.toCharArray()) {
            windowCount.put(ch, windowCount.getOrDefault(ch, 0) + 1);
        }

        // Check: for each char target needs, does window have enough?
        for (char ch : targetCount.keySet()) {
            int needed = targetCount.get(ch);
            int available = windowCount.getOrDefault(ch, 0);

            if (available < needed) {
                return false; // Not enough of this character
            }
        }

        return true; // Window has everything target needs!
    }
}
