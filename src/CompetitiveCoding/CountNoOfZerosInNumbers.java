package CompetitiveCoding;

import java.util.Scanner;

public class CountNoOfZerosInNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int count = 0;

        if (n == 0) {
            System.out.println(1);
        }
            while (n > 0) {
                if (n % 10 == 0) {
                    count++;
                }
                n = n / 10;
            }

        System.out.println(count);

    }
}
