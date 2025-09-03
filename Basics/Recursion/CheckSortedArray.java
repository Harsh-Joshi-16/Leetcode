package Basics.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CheckSortedArray {
    public static void main(String[] args) {
        System.out.println(isSorted(new ArrayList<>(Arrays.asList(1, 2, 1, 4, 5))));
    }

    static boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
