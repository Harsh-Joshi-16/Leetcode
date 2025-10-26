package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePairs {
    public static void main(String[] args) {
        System.out.println(reversePairs(new int[]{2, 3, 7, 1, 3, 5}));
        System.out.println(Arrays.toString(reversePairsMergeSort(new int[]{2, 3, 7, 1, 3, 5})));
    }

    // brute force
    static int reversePairs(int[] nums) {
        int totalPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            // iterate second loop from i+1 to n
            for (int j = i + 1; j < nums.length; j++) {
                // here eventually i is always smaller then j
                if (nums[i] > 2 * nums[j]) {
                    totalPairs++;
                }
            }
        }
        return totalPairs;
    }

    // merge sort
    static int[] reversePairsMergeSort(int[] nums) {
        // start the initial division from 0 -> nums.length - 1
        mergeSortDivision(nums, 0, nums.length - 1);
        return nums;
    }

    static void mergeSortDivision(int[] nums, int low, int high) {
        // check if low has become equal to high, to be safe check of low > high too as if it never becomes
        if (low >= high) {
            return;
        }

        // count the mid
        int mid = (low + high) / 2;

        // divide further until low become equal to hight
        mergeSortDivision(nums, 0, mid);
        mergeSortDivision(nums, mid + 1, high);

        // once division is done start merging, here it will come once low >= high and will go backwards
        mergeNums(nums, low, mid, high);
    }

    static void mergeNums(int[] nums, int low, int mid, int high) {
        // start merging left and right by taking left as low and right as mid + 1, reason as we need to merge
        // two divided arrays either from low to mid or from mid+1 to high
        List<Integer> integerList = new ArrayList<>();
        int left = low, right = mid + 1;
        // merge divided arrays till left is smaller or equal to mid and mid is smaller and equal to high
        while (left <= mid && right <= high) {
            // simple check which is smaller number add that to the list and increment that position counter
            if (nums[left] <= nums[right]) {
                integerList.add(nums[left]);
                left++;
            } else {
                integerList.add(nums[right]);
                right++;
            }

            // add the remaining number of the left
            while (left <= mid) {
                integerList.add(nums[left]);
                left++;
            }

            // add the remaining number of the left
            while (right <= high) {
                integerList.add(nums[right]);
                right++;
            }

            // transferring the list to array
            // Transferring the sorted elements to arr
            for (int i = low; i <= high; i++) {
                nums[i] = integerList.get(i - low);
            }
        }
    }
}