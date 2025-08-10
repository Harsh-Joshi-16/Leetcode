package Basics.Maths;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int num = n; // keeping track of original num
        n = Math.abs(n);
        int newNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            newNum = newNum * 10 + lastDigit;
            n = n / 10;
        }
        return newNum == num;
    }
}
