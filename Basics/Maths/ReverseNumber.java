package Basics.Maths;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        n = Math.abs(n);
        int newNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            newNum = newNum * 10 + lastDigit;
            n = n / 10;
        }
        return newNum;
    }
}
