package Dequeue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinElementInKWindow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    static int[] minWindow(int[] nums, int k) {
        // List to store all the min nums
        List<Integer> minNums = new ArrayList<>();
        // dequeue to check if num in min in given window
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // iterating over array
        for (int i = 0; i < nums.length; i++) {
            // remove elements from start
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.removeFirst();
            }
            // adding element to the back of the dequeue
            while (!deque.isEmpty() && nums[i] < nums[deque.peekLast()]) {
                deque.removeLast();
            }
            // adding in queue
            deque.add(i);
            // adding in list once find min in k window
            if (i >= k - 1) {
                minNums.add(nums[deque.peekFirst()]);
            }
        }

        return minNums.stream().mapToInt(i -> i).toArray();
    }
}
