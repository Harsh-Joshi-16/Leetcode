package Basics.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharactersList {
    public static void main(String[] args) {
        System.out.println(frequencySort("raaaajj"));
    }

    public static List<Character> frequencySort(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        List<Character> sortedChars = new ArrayList<>();
        // count all the frequencies of the chars
        for (char c : s.toCharArray()) {
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }

        // storing char as per the sorted map.values();
        List<Character> result = new ArrayList<>(characterIntegerMap.keySet());
        Collections.sort(result, (a, b) -> {
            if (characterIntegerMap.get(a) != characterIntegerMap.get(b)) {
                return Integer.compare(characterIntegerMap.get(b), characterIntegerMap.get(a));
            }
            return a - b;
        });
        return result;
    }
}
