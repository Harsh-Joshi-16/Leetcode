package Basics.Maths;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int countOfNum = String.valueOf(n).length();
        int sumOfNumbers = 0;
        int num = n;
        while (num > 0){
            int digit = num % 10;
            sumOfNumbers += (int) Math.pow(digit, countOfNum);
            num = num / 10;
        }
        return sumOfNumbers == n;
    }
}
