package Patterns;

public class Pattern18_1 {
    public static void main(String[] args) {
        char ch = 'A' + 4;
        for (int row = 0; row < 5; row++) {
            char current = (char)(ch - row);
            for (char cha = ch; cha >= current; cha--) {
                System.out.print(cha + " ");
            }
            System.out.println();
        }
    }
}
