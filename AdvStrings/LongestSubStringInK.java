package AdvStrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringInK {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maLength = 0, leftTracker = 0;
        Map<Character, Integer> trackerChars = new HashMap<>();
        for (int read = 0; read < s.length(); read++) {
            char current = s.charAt(read);
            // insert in map
            trackerChars.put(current, trackerChars.getOrDefault(current, 0) + 1);
            // need to check the chars which has unique chars at most 2, doesn't care how many times
            // shrink window till only k unique elements are there
            while (trackerChars.size() > k) {
                // so now we have more than k unique characters
                // need to remove the character at left
                char leftChar = s.charAt(leftTracker);
                trackerChars.put(leftChar, trackerChars.get(leftChar) - 1);

                // if there is no other that particular char left then remove it
                if (trackerChars.get(leftChar) == 0) {
                    trackerChars.remove(leftChar);
                }
                leftTracker++;
            }

            maLength = Math.max(maLength, read - leftTracker + 1);
        }

        return maLength;
    }
}
