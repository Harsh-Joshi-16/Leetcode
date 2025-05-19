package Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == 0 || row == 5 - 1 || col == 0 || col == 5 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
