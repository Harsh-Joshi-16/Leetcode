package Basics.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    static int fib(int n) {
        System.out.println(n);
        if (n != 0) {
            return fib(n - 1);
        } else {
            return 1;
        }
    }
}
