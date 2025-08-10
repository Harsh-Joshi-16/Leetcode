package Basics.Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorsOfNumber {
    public static int[] divisors(int n) {
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisor.add(i);
                int pair = n / i;
                if (pair != i) {
                    divisor.add(pair);
                }
            }
        }
        return divisor.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
