package AdvStrings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aaabbbccc"));
        System.out.println(lengthOfLongestSubstringMap("aaabbbccc"));
    }

    static int lengthOfLongestSubstring(String s) {
        // set to keep track of the chars visited
        Set<Character> characters = new LinkedHashSet<>();

        // decalring variables
        int left = 0, maxLength = 0;

        //iterate through string
        for (int read = 0; read < s.length(); read++) {
            char c = s.charAt(read);

            if (characters.contains(c)) {
                characters.remove(s.charAt(left));
                left++;
            }
            characters.add(c);
            maxLength = Math.max(maxLength, read - left + 1);
        }

        System.out.println(characters);
        return maxLength;
    }

    static int lengthOfLongestSubstringMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for (int right = 0; right < s.length(); right++) {
            // increment /add value in the map
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            if (map.get(rightChar) > 1) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
