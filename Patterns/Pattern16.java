package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int row = 0; row < 5; row++) {
            char current = (char)(ch + row);
            for (int col = 0; col <= row; col++) {
                System.out.print(current + " ");
            }
            System.out.println();
        }
    }
}
