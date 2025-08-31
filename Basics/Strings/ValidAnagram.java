package Basics.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(anagramStrings("ehdxhsdnogzzvjscksjhqtloijrlqhpcawgtaupnoxqysedztsuajuasvyldclayszbdfdcdpnrwrietehxdbgbeblxvxvjigvbu",
                "ehdxhsdnogzzvjscksjhqtloijrlqhpcawgtaupnoxqysedztsuajuasvyldclayszbdfdcdpnrwrietehxdbgbeblxvxvjigvbz"));
    }

    public static boolean anagramStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> charS = new HashMap<>();
        Map<Character, Integer> charT = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            charS.put(s1.charAt(i), charS.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            charT.put(s2.charAt(i), charT.getOrDefault(s2.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> map : charS.entrySet()) {
            if (!Objects.equals(map.getValue(), charT.get(map.getKey()))) {
                return false;
            }
        }

        return true;
    }
}
