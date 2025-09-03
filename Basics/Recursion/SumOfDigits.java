package Basics.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    static int addDigits(int num) {
        int sum = 0;
        if (num / 10 == 0) {
            return num;
        }
        while (num > 0) {
            int ld = num % 10;
            sum += ld;
            num /= 10;
        }
        return addDigits(sum);
    }
}
