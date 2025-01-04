package CompetitiveCoding;

import java.util.*;

public class MultiplesOF3And5 {


        public static long sumOfMul(int n, int x) {
            long p = (n - 1) / x;
            return x * p * (p + 1) / 2;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int t = in.nextInt();
            long[] ln = new long[t];

            for (int i = 0; i < t; i++) {
                int n = in.nextInt();

                long sum3 = sumOfMul(n, 3);
                long sum5 = sumOfMul(n, 5);
                long sum15 = sumOfMul(n, 15);
                ln[i] = sum3 + sum5 - sum15;
            }
            for (long result : ln) {
                System.out.println(result);
            }
        }
}
