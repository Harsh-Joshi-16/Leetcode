package AdvArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicate(new int[]{99999999, 100000000, 100000000, 100000001})));
        System.out.println(Arrays.toString(removeDuplicateTwoPointers(new int[]{99999999, 100000000, 100000000, 100000001})));
    }

    static int[] removeDuplicate(int[] nums) {
        Set<Integer> integerSet = new LinkedHashSet<>();
        for (int j : nums) {
            integerSet.add(j);
        }
        int i = 0;
        for (int num : integerSet) {
            nums[i++] = num;
        }
        return nums;
    }

    static int[] removeDuplicateTwoPointers(int[] nums) {
        int writePos = 0; // position at which element should be written
        for (int read = 1; read < nums.length; read++){
            if(nums[read] != nums[writePos]) {
                // here the unique found as in example nums[write] = 1, and nums[read] = 2;
                writePos++; // incrementing write to next index to write
                nums[writePos] = nums[read]; // placing element 2 at index 1
            }
        }
        return nums;
    }
}
