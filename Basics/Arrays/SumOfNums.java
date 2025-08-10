package Basics.Arrays;

import java.util.Arrays;

public class SumOfNums {
    public static int sum(int arr[], int n) {
        int sumOfNum = 0;
        for (int i = 0; i < n; i++) {
            sumOfNum += arr[i];
        }
        return sumOfNum;
    }

    public static int sumStreams(int arr[], int n) {
       return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(sumStreams(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
