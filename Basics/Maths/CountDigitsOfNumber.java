package Basics.Maths;

public class CountDigitsOfNumber {
    public static int countDigit(int num) {
        int count = 0;
        do {
            count++;
            num = num / 10;
        } while (num > 0);
        return count;

        // alternate usage
//        String digitString = String.valueOf(num);
//        return digitString.length();
    }
}
