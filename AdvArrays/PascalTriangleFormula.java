package AdvArrays;

public class PascalTriangleFormula {
    public static void main(String[] args) {
        System.out.println(pascalTriangleFormula(10000000, 900000000));
    }

    static int pascalTriangleFormula(int r, int c) {
        // starting result from 1 as there will always be 1 in each circumstances
        // convert the numbers to 0 index based
        int n = r - 1, k = c - 1, result = 1;
        for (int i = 1; i <= k; i++) {
            System.out.println(i);
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}
