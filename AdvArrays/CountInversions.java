package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountInversions {
    public static void main(String[] args) {
        System.out.println(numberOfInversionsBruteForce(new int[]{2, 3, 7, 1, 3, 5}));
        System.out.println(numberOfInversionsMergeSort(new int[]{2, 3, 7, 1, 3, 5}));
    }

    // brute force
    static long numberOfInversionsBruteForce(int[] nums) {
        long totalInversions = 0;
        // Inversion happens when the nums[i] > nums[j] and i < j
        // i.e. example nums[0] > nums[1] and 0 < 1
        // iterate through first loop from 0 to n
        for (int i = 0; i < nums.length; i++) {
            // iterate second loop from i+1 to n
            for (int j = i + 1; j < nums.length; j++) {
                // here eventually i is always smaller then j
                if (nums[i] > 2 * nums[j]) {
                    totalInversions++;
                }
            }
        }
        return totalInversions;
    }

    // merge sort approach
    static long numberOfInversionsMergeSort(int[] nums) {
        return mergeSortHelper(nums, 0, nums.length - 1);
    }

    static long mergeSortHelper(int[] nums, int left, int right) {
        long count = 0;
        if (left >= right) return 0;

        int mid = (left + right) / 2;

        // Count in left + right halves
        count += mergeSortHelper(nums, left, mid);
        count += mergeSortHelper(nums, mid + 1, right);

        // Count cross reverse pairs before merging
        count += countReversePairs(nums, left, mid, right);

        // Just merge arrays — don't add count here
        merge(nums, left, mid, right);

        return count;
    }

    static void merge(int[] nums, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) temp.add(nums[i++]);
            else temp.add(nums[j++]);
        }

        while (i <= mid) temp.add(nums[i++]);
        while (j <= right) temp.add(nums[j++]);

        for (int k = left; k <= right; k++) {
            nums[k] = temp.get(k - left);
        }
    }

    static int countReversePairs(int[] nums, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2L * nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }
}
