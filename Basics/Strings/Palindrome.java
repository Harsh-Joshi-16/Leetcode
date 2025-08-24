package Basics.Strings;

public class Palindrome {
    public static boolean palindromeCheck(String s) {
        //your code goes here
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

    public static void main(String[] args) {
        System.out.println(palindromeCheck("aabbaaa"));
    }
}
