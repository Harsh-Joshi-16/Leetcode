package Basics.Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {
        System.out.println(isomorphicString("egg", "add"));
    }

    public static boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sTOt = new HashMap<>();
        Map<Character, Character> tTOs = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sTOt.containsKey(sc) && sTOt.get(sc) != tc) {
                return false;
            }

            if (tTOs.containsKey(tc) && tTOs.get(tc) != sc) {
                return false;
            }

            sTOt.put(sc, tc);
            tTOs.put(tc, sc);
        }

        return true;
    }
}
