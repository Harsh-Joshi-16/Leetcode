package AdvArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatingAndMissing {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(new int[]{3, 5, 4, 1, 1})));
        System.out.println(Arrays.toString(findMissingAndRepeatingViaSums(new int[]{3, 5, 4, 1, 1})));
        System.out.println(Arrays.toString(findMissingAndRepeatingXOR(new int[]{3, 5, 4, 1, 1})));
    }

    static int[] findMissingRepeatingNumbers(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        int repeating = Integer.MIN_VALUE;
        for (int num : nums) {
            if (integerSet.contains(num)) {
                repeating = num;
                break;
            } else {
                integerSet.add(num);
            }
        }

        int missing = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (!integerSet.contains(i + 1)) {
                missing = i + 1;
                break;
            }
        }
        return new int[]{repeating, missing};
    }

    static int[] findMissingAndRepeatingViaSums(int[] nums) {
        int n = nums.length;
        // sum of all the numbers via formula
        long sumOfAllNums = (long) n * (n + 1) / 2;
        // sum of all the squares of num from 1 to n
        long sumOfAllSquaresOfNum = (long) n * (n + 1) * (2 * n + 1) / 6;
        long actualSum = 0;
        long actualSqaureOfSum = 0;
        // finding actual sum of all nums
        for (int num : nums) {
            actualSum += num;
            actualSqaureOfSum += (long) num * num;
        }

        // x - y = expectedSum - actualSum
        long diff1 = sumOfAllNums - actualSum; // missing - repeating
        // x + y = expectedSumOfSquares - actualSumOfSquares / (x-y)
        long diff2 = (sumOfAllSquaresOfNum - actualSqaureOfSum) / diff1; // missing + repeating
        long missing = (diff1 + diff2) / 2;
        long repeating = (diff2 - diff1) / 2;
        return new int[]{(int) repeating, (int) missing};
    }

    static int[] findMissingAndRepeatingXOR(int[] nums) {
        int xorAll = 0;
        int n = nums.length;

        // Step 1 : Do the XOR of all elements with all possible num in array
        for (int i = 0; i < nums.length; i++) {
            xorAll ^= nums[i];
            xorAll ^= i;
        }

        // Step 2 : Find rightmost set bit
        int rightmostSetBit = xorAll & -xorAll;
        System.out.println(rightmostSetBit);
        int bucket1 = 0, bucket2 = 0;
        // Step 3: Divide into two buckets based on this bit
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0)
                bucket1 ^= num;
            else
                bucket2 ^= num;
        }

        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0)
                bucket1 ^= i;
            else
                bucket2 ^= i;
        }

        // Step 4: Check which is missing, which is repeating
        for (int num : nums) {
            if (num == bucket1)
                return new int[]{bucket1, bucket2}; // {repeating, missing}
        }

        return new int[]{bucket2, bucket1};
    }
}
