package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }
}
