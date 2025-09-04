package Basics.Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    static int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            int val = map.get(s.charAt(i));
            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > val) {
                sum -= val;
            } else {
                sum += val;
            }
        }
        return sum;
    }
}
