package Basics.Strings;

public class RotateStrings {
    public static void main(String[] args) {
        System.out.println(rotateString("x", "xx"));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String newString = s + s;
        return newString.contains(goal);
    }
}
