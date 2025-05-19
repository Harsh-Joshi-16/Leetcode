package Patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int totalRows = 3 * 2 - 1;
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalRows; col++) {
                int layer = Math.min(Math.min(row, col), Math.min(totalRows - 1 - row, totalRows - 1 - col));
                int value = 3 - layer;
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
