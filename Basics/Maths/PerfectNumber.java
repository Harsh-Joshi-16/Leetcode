package Basics.Maths;

public class PerfectNumber {
    public static boolean isPerfect(int n) {
        int sumOfDivisor = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisor += i;
            }
        }
        return sumOfDivisor == n;
    }
}
