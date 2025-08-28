package Basics.Strings;

public class LargestOddNum {
    public static String largeOddNum(String s) {
        //your code goes here
        char[] c = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (c[i] % 2 != 0) {
                String result = s.substring(0, i + 1);
                return result.replaceFirst("^0+", "");
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largeOddNum("05347"));
    }
}
