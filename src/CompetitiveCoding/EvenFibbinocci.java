package CompetitiveCoding;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class EvenFibbinocci {

        public static long sumEvenFibonacci(long n) {
            long a = 0, b = 1, sum = 0;
            while (b <= n) {
                if (b % 2 == 0) {
                    sum += b;
                }
                long temp = a + b;
                a = b;
                b = temp;
            }
            return sum;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for(int a0 = 0; a0 < t; a0++){
                long n = in.nextLong();
                System.out.println(sumEvenFibonacci(n));
            }
        }

}
