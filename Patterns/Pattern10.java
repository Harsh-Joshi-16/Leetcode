package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        for (int row = 1; row <= 2 * 10 - 1; row++) {
            if (row < 10) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 1; col <= 2 * 10 - row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
