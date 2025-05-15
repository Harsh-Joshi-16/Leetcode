package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        for (int row = 0; row < 3; row++) {
            // space before *
            for (int col = 3 - 1; col > row; col--) {
                System.out.print(" ");
            }
            // *
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
//            Alternative
//            System.out.print(" ".repeat(3-1-row));
//            System.out.println("*".repeat(2*row+1));
        }
    }
}
