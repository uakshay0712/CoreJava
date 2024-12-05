package CompetitiveCoding;

import java.util.Scanner;

public class PellSequence {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println(pell(n));
    }

    public static long pell(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long[] pell = new long[n + 1];
            pell[0] = 0;
            pell[1] = 1;
            for (int i = 2; i <= n; i++) {
                pell[i] = 2 * pell[i - 1] + pell[i - 2];
            }
            return pell[n];
            }
        }
    }
