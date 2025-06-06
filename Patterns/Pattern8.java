package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        for (int row = 0; row < 3; row++) {
            // space before *
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            // *
            for (int col = 0; col < 2 * (3 - row) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
