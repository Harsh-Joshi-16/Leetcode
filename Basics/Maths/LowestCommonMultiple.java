package Basics.Maths;

public class LowestCommonMultiple {
    public static int LCM(int n1, int n2) {
        int max = Math.max(n1, n2);
        for (int i = 1; i <= max; i++) {
            int multiple = max * i;
            if (multiple % n1 == 0 && multiple % n2 == 0) {
                return multiple;
            }
        }
        return 0;
    }
}
