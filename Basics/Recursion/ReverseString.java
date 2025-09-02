package Basics.Recursion;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString(Arrays.asList('h', 'e', 'l', 'l', 'o')));
    }

    static List<Character> reverseString(List<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        while (left < right) {
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            left++;
            right--;
        }
        return s;
    }
}
