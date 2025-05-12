package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        for (int row = 5; row > 0; row--) {
            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
