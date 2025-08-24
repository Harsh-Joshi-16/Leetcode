package Basics.Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void reverseString(List<Character> s) {
        int left = 0, right = s.size() - 1;
        while (left < right) {
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            left++;
            right--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String word = "hello";
        List<Character> charList = new ArrayList<>();
        for (char c : word.toCharArray()) {
            charList.add(c);
        }
        reverseString(charList);
    }
}
