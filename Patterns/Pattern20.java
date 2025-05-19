package Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int totalRows = 3 * 2 - 1;
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col <= totalRows; col++) {
                if (row < 3 && (col <= row || col >= totalRows - row)) {
                    System.out.print("*");
                } else if (row >= 3 && (col < totalRows - row || col > row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
