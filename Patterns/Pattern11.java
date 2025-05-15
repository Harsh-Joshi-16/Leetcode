package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            int count = row%2 == 0 ? 1 : 0;
            for (int col = 0; col <= row; col++) {
                System.out.print(count + " ");
                count = 1 - count;
            }
            System.out.println();
        }
    }
}
