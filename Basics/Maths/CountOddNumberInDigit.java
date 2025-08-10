package Basics.Maths;

public class CountOddNumberInDigit {
    public static int countOddDigit(int n) {
        int countOdd = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                countOdd++;
            }
            n = n / 10;
        }
        return countOdd;
    }
}
