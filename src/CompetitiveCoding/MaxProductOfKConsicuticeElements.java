package CompetitiveCoding;

import java.util.Scanner;

public class MaxProductOfKConsicuticeElements {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int k = scr.nextInt();
        int[] a = new int[n];
        int i, j, prod = 1, max = -99999999;
        for (i = 0; i < n; i++)
            a[i] = scr.nextInt();
        for (i = 0; i < n - k + 1; i++) {
            prod = 1;

            for (j = 0; j < k; j++)
                prod = prod * a[i + j];
            if (max < prod)
                max = prod;
        }
        System.out.println(max);
    }
}
