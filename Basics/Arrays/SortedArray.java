package Basics.Arrays;

import java.util.stream.IntStream;

public class SortedArray {
    public static boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean arraySortedOrNotStream(int[] arr, int n) {
        return IntStream.range(1, arr.length).allMatch(i -> arr[i] >= arr[i - 1]);
    }

    public static void main(String[] args) {
        System.out.println("Is Array Sorted : " + arraySortedOrNot(new int[]{1, 2, 3, 4, 5}, 6));
        System.out.println("Is Array Sorted : " + arraySortedOrNotStream(new int[]{1, 2, 3, 4, 5}, 6));
    }
}
