package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{5, 4, 1, 1})));
    }

    static int[] mergeSort(int[] nums) {
        mergeSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    static void mergeSortHelper(int[] nums, int low, int high) {
        // keep dividing until the left is greater than high or equal case where only one element is there in nums
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        // keep triggering for left till one element array is thee
        mergeSortHelper(nums, low, mid);
        // keep triggering for right till one element array is there in high
        mergeSortHelper(nums, mid + 1, high);
        // finally start merging
        merge(nums, low, mid, high);
    }

    static void merge(int[] nums, int low, int mid, int high) {
        List<Integer> integerList = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            // compare element of left and rigth smaller add
            if (nums[left] <= nums[right]) {
                integerList.add(nums[left]);
                left++;
            } else {
                integerList.add(nums[right]);
                right++;
            }
        }

        // Adding the remaining elements of left half
        while (left <= mid) {
            integerList.add(nums[left]);
            left++;
        }

        // Adding the remaining elements of right half
        while (right <= high) {
            integerList.add(nums[right]);
            right++;
        }

        // Transferring the sorted elements to arr
        for (int i = low; i <= high; i++) {
            nums[i] = integerList.get(i - low);
        }
    }
}
