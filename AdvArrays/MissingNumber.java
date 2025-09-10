package AdvArrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 2, 3, 1, 4}));
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return total - sum;
    }
}
