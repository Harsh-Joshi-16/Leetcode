package Patterns;

public class Pattern17_1 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            // spaces
            for (int col = 5 - 1; col > row; col--) {
                System.out.print(" ");
            }
            // letters
            int val = 1;
            int breakpoint = ((2 * row) + 1) / 2;
            for (int col = 1; col <= (2 * row) + 1; col++) {
                System.out.print(val);
                if (col <= breakpoint) val++;
                else val--;
            }
            System.out.println();

        }
    }
}
