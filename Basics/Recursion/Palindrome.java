package Basics.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("aabbaaa"));
    }

    static boolean palindromeCheck(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while (left < right) {
            if (c[left] != c[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
