package CompetitiveCoding;

import java.util.Scanner;

public class LongestIncreasingContinuousSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int count = 1, i, j, max = -99999999;
        for (i = 0; i < n; i++)
            a[i] = s.nextInt();
        for (i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1])
                count++;
            else {
                if (max < count)
                    max = count;
                count = 1;
            }
        }
        if (max < count)
            max = count;
        System.out.println(max);
        }

    }
