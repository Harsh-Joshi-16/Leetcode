package Basics.Maths;

public class GreatestCommonDivisor {
    public static int GCD(int n1, int n2) {
        int largestCommonDivisor = 1; // GCD is at least 1

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                largestCommonDivisor = i;
            }
        }

        return largestCommonDivisor;
    }
}
