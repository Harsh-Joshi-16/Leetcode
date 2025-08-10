package Basics.Maths;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count = CountDigitsOfNumber.countDigit(123);
        System.out.println("Count of digit " + count);
        int countOdd = CountOddNumberInDigit.countOddDigit(15);
        System.out.println("Count of odd number in digit " + countOdd);
        int reverseNum = ReverseNumber.reverseNumber(123);
        System.out.println("Reverse Num " + reverseNum);
        boolean isPalindrome = Palindrome.isPalindrome(121);
        System.out.println("Is Palindrome " + isPalindrome);
        int largestDigit = LargestDigit.largestDigit(351);
        System.out.println("Largest digit is " + largestDigit);
        int factorial = Factorial.factorial(5);
        System.out.println("Factorial of num is " + factorial);
        boolean isArmstrong = Armstrong.isArmstrong(370);
        System.out.println("Is Armstrong " + isArmstrong);
        boolean isPerfectNum = PerfectNumber.isPerfect(7);
        System.out.println("Is perfect num " + isPerfectNum);
        boolean isPrimeNumber = IsPrimeNumber.isPrime(7);
        System.out.println("Is prime number " + isPrimeNumber);
        int countPrime = CountPrime.primeUptoN(28);
        System.out.println("Prime up to N is " + countPrime);
        int greatestCommonDivisor = GreatestCommonDivisor.GCD(4, 6);
        System.out.println("GCD is " + greatestCommonDivisor);
        int lcm = LowestCommonMultiple.LCM(4, 6);
        System.out.println("LCM is " + lcm);
        int[] divisors = DivisorsOfNumber.divisors(70);
        System.out.println("Divisors is " + Arrays.toString(divisors));
    }
}
