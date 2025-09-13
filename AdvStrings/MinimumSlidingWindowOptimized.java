package AdvStrings;

import java.util.HashMap;
import java.util.Map;

public class MinimumSlidingWindowOptimized {
    public static void main(String[] args) {
        System.out.println(minWindow("a", "aa"));
    }

    static String minWindow(String s, String t) {
        // Map to store target string chars and count
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        // Count what we currently have in window
        Map<Character, Integer> have = new HashMap<>();
        // variable to track left index and minLength
        int left = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        // iterating through source string
        for (int right = 0; right < s.length(); right++) {
            // putting the character we read in what we have map
            char rightChar = s.charAt(right);
            have.put(rightChar, have.getOrDefault(rightChar, 0) + 1);
            // check if window is valid
            while (isValidWindow(need, have)) {
                // if yes then update result
                // check if we have min length
                if (right - left + 1 < minLength) {
                    // if current window is minimum update the minlength and minstart from that location
                    minLength = right - left + 1;
                    minStart = left;
                }
                // remove the character of left from have as we no longer consider the left in the window
                char leftChar = s.charAt(left);
                have.put(leftChar, have.getOrDefault(leftChar, 0) - 1);
                if (have.get(leftChar) == 0) {
                    have.remove(leftChar);
                }
                // if the current valid window is not minlength then shift the window
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    static boolean isValidWindow(Map<Character, Integer> need, Map<Character, Integer> have) {
        // check if have all that needs
        for (char c : need.keySet()) {
            int needChar = need.get(c);
            int haveChar = have.getOrDefault(c, 0);
            if (haveChar < needChar) {
                return false;
            }
        }
        return true;
    }
}
