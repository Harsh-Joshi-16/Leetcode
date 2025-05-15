package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            // first traingle
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // spaces
            int spaces = 2 * (5 - row);
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  "); // Two spaces to match number + space width
            }
            // second traingle
            for (int col = row; col > 0; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
