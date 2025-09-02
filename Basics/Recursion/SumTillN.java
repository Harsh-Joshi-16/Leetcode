package Basics.Recursion;

public class SumTillN {
    public static void main(String[] args) {
        System.out.println(NumbersNSum(4));
    }

    public static int NumbersNSum(int N) {
        System.out.println(N);
        if (N == 1) return N;
        return N + NumbersNSum(N - 1);
    }
}
