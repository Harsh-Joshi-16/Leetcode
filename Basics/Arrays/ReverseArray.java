package Basics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static int[] reverse(int[] arr, int n) {
        List<Integer> reverseArray = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray.add(arr[i]);
        }
        return reverseArray.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] reverseInSameArr(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(reverseInSameArr(new int[]{1, 2, 3, 4, 5}, 5)));
    }
}
