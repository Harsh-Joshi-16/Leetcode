package AdvArrays;

import java.util.Arrays;

public class PermutationCombination {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPermutation(new int[]{3, 2, 1})));
    }

    static int[] nextPermutation(int[] nums) {
        // Step 1 : Find the smallest number in the order where changing it will make the next possible array.
        // i.e. going from right to left find the element which is not in desc order
        int indexWhereElementShouldBeSwapped = 0;
        int indexOfElementToSwapped = 0;
        boolean found = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                indexWhereElementShouldBeSwapped = i;
                found = true;
                break;
            }
        }

        if (!found) {
            reverse(nums, 0, nums.length - 1);
            return nums;
        }
        // Step 2 : After the element to swap found , find the element from index found + 1 till the last element
        // which is bigger then the element found but smallest in the sub array range (elementToSwapIndex + 1 -> nums.length)
        for (int i = nums.length - 1; i > indexWhereElementShouldBeSwapped; i--) {
            if (nums[i] > nums[indexWhereElementShouldBeSwapped]) {
                indexOfElementToSwapped = i;
                break;
            }
        }
        swap(nums, indexWhereElementShouldBeSwapped, indexOfElementToSwapped);
        // Step 3 : reverse the numbers in range (elementToSwapIndex + 1 -> nums.length)
        reverse(nums, indexWhereElementShouldBeSwapped + 1, nums.length - 1);
        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
