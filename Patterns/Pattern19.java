package Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 2 * 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row < n / 2 && (col < (n / 2 - row) || col >= (n / 2 + row))) {
                    System.out.print('*');
                } else if (row >= n / 2 && (col <= (row - n / 2) || col >= (n - row + n / 2 - 1))) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}