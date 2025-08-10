package Basics.Maths;

public class CountPrime {
    public static int primeUptoN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true; // Assume i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // Found a divisor
                    break; // No need to check further
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
