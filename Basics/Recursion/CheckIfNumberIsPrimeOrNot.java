package Basics.Recursion;

public class CheckIfNumberIsPrimeOrNot {
    public static void main(String[] args) {
        System.out.println(checkPrime(9));
    }

    static boolean checkPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.println(i);
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
