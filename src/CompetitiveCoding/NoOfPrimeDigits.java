package CompetitiveCoding;

import java.util.Scanner;

public class NoOfPrimeDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N=scr.nextInt();
        System.out.println(countPrimeDigits(N));
    }
    public static int countPrimeDigits(int N){
        int count =0;
        while (N>0){
            int digit=N%10;
            if(isPrimeDigit(digit))
                count++;
            N=N/10;
        }
        return count;
    }
    public static boolean isPrimeDigit(int digit){
        return digit==2 || digit==3|| digit==5||digit==7;

    }
}
