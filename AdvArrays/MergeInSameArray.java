package AdvArrays;

import java.util.Arrays;

public class MergeInSameArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{-5, -2, 4, 5, 0, 0, 0}, 4, new int[]{-3, 1, 8}, 3)));
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // declare pointers as all are sorted start from greater going to the smallest
        // p1 is to track the nums in nums1, p2 is to track nums in nums2, and pw is the write pointer
        int p1 = m - 1, p2 = n - 1, pw = m + n - 1;
        // write until the p1 or p2 reaches 0
        while (p1 >= 0 && p2 >= 0) {
            // check in which is the greater number
            // nums1 last element is greater than last element in nums2 consider nums1
            if (nums1[p1] > nums2[p2]) {
                nums1[pw] = nums1[p1];
                // as the last element in nums1 is considered move to next element i.e. p1--
                p1--;
            } else {
                // here the nums2 is greater than nums1
                // write at pw pointer and once write move pw pointer to next write location
                nums1[pw] = nums2[p2];
                p2--;
            }
            // also now there is element at write location move pw to next write location
            pw--;
        }

        // there might be cases where the nums2 array is bigger than nums1 of length m
        // write the remaining elements as there are already sorted just write them at write pointer decrementing the pointer
        while (p2 >= 0) {
            nums1[pw] = nums2[p2];
            p2--;
            pw--;
        }

        return nums1;
    }
}
