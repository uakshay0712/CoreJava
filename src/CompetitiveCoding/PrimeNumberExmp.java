package CompetitiveCoding;

import java.util.Scanner;

public class PrimeNumberExmp {
    public static int isPrime(int n) {
        if (n == 1 || n == 2 || n == 3)
            return 1;
        if (n % 2 == 0 || n % 3 == 0)
            return 0;
        int i;
        int a = n / 2;
        for (i = 5; i <= a; i=i+6)
            if (n % i == 0 || n % (i + 2) == 0)
                return 0;

        return 1;
    }

    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the value: ");
        if(PrimeNumberExmp.isPrime(scr.nextInt())!=0){
            System.out.println("Prime Number");
        }else
            System.out.println("Not Prime NUmber");
    }
}
