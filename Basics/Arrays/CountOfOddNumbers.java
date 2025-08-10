package Basics.Arrays;

import java.util.Arrays;

public class CountOfOddNumbers {
    public static int countOdd(int[] arr, int n) {
        return (int) Arrays.stream(arr).filter(num -> num % 2 != 0).count();
    }

    public static void main(String[] args) {
        System.out.println(CountOfOddNumbers.countOdd(new int[]{1,2,1,1,5,1}, 6));
    }
}
