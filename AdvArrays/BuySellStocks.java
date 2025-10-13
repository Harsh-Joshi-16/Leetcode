package AdvArrays;

public class BuySellStocks {
    public static void main(String[] args) {
        System.out.println(buySellStocks(new int[]{7, 1, 5, 3, 6, 4}));
    }

    static int buySellStocks(int[] nums) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int num : nums) {
            minValue = Math.min(minValue, num);
            maxProfit = Math.max(maxProfit, num - minValue);
        }
        return maxProfit;
    }
}
