package Dequeue;

import java.util.*;

public class MaxElementInKWindow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    static int[] maxWindow(int[] nums, int k) {
        // to store the max element
        List<Integer> integerList = new ArrayList<>();
        // to check the if element is max in given window
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        
        for(int right = 0; right < nums.length; right++) {
            // remove elements from start
            while(!integerArrayDeque.isEmpty() && integerArrayDeque.peekFirst() < right - k+ 1) {
                integerArrayDeque.removeFirst();
            }
            // adding element to the back of the dequeue
            while (!integerArrayDeque.isEmpty() && nums[right] > nums[integerArrayDeque.peekLast()]) {
                integerArrayDeque.removeLast();
            }
            // add current element to last
            integerArrayDeque.addLast(right);

            // STEP 4: Record result if window is complete
            if (right >= k - 1) {
                integerList.add(nums[integerArrayDeque.peekFirst()]);
            }
        }

        return integerList.stream().mapToInt(i -> i).toArray();
    }
}
