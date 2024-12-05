package CompetitiveCoding;

import java.util.Scanner;

public class DigitalRoot {

    public static int calculateDigitalRoot(int n){
        while (n > 9) {
            n = sumOfDigits(n);
        }
        return n;

    }
    public static int sumOfDigits(int n){
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;


    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        int digitalRoot = calculateDigitalRoot(n);

        System.out.println(digitalRoot);
    }

}
