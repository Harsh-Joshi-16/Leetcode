package AdvArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersectionArray(new int[]{1, 2, 2, 3, 3, 3}, new int[]{2, 3, 3, 4, 5, 7})));
    }

    static int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = 0;
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                list.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
