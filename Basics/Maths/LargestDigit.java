package Basics.Maths;

public class LargestDigit {
    public static int largestDigit(int n) {
        int largestNum = 0;
        while (n > 0) {
            int currentNum = n % 10;
            if (currentNum > largestNum) {
                largestNum = currentNum;
            }
            n = n / 10;
        }
        return largestNum;
    }
}
