package Basics.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }

    public static long factorial(int n) {
        long fact = 1;
        if (n == 0 || n == 1) return fact;
        fact = n * factorial(n - 1);
        return fact;
    }
}
