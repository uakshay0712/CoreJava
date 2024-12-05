package CompetitiveCoding;

import java.util.Scanner;

public class LucasSequence {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if (n == 0) {
            System.out.println(2);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }
        long L0 = 2, L1 = 1, Ln = 0;
        for (int i = 2; i <= n; i++) {
            Ln = L0 + L1;
            L0 = L1;
            L1 = Ln;
        }
        System.out.println(Ln);
    }
}
