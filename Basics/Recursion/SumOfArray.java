package Basics.Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{1, 2, 3}));
    }

    public static int arraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}
