package AdvArrays;

import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(unionArray(new int[]{3, 4, 6, 7, 9, 9}, new int[]{1, 5, 7, 8, 8})));
    }

    static int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> integers = new ArrayList<>();
        Set<Integer> numTrack = new HashSet<>();
        // to track left array and right array
        int left = 0, right = 0;
        // size of both arrays
        int lsize = nums1.length, rsize = nums2.length;

        // loop until both the arrays are scanned
        while (left < lsize && right < rsize) {
            // check if num exists in both and is unique then add
            // then check if nums1 < nums2 then add nums1 if unique
            // else add nums2
            if (nums1[left] == nums2[right] && !numTrack.contains(nums1[left])) {
                // adding in the array list and set to track at next pointer
                integers.add(nums1[left]);
                numTrack.add(nums1[left]);
                // increment both to next pointer
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                if (!numTrack.contains(nums1[left])) {
                    // if num is lesser in nums1 add it to list and increment
                    integers.add(nums1[left]);
                    numTrack.add(nums1[left]);
                }
                left++;
            } else {
                if (!numTrack.contains(nums2[right])) {
                    integers.add(nums2[right]);
                    numTrack.add(nums2[right]);
                }
                right++;
            }

        }
        // add remaining elements from left
        while (left < lsize) {
            if (!numTrack.contains(nums1[left])) {
                integers.add(nums1[left]);
                numTrack.add(nums1[left]);
            }

            left++;
        }

        // adding remining element from right
        while (right < rsize) {
            if (!numTrack.contains(nums2[right])) {
                integers.add(nums2[right]);
                numTrack.add(nums2[right]);
            }

            right++;
        }

        return integers.stream().mapToInt(Integer::intValue).toArray();
    }
}
