package CompetitiveCoding;

import java.util.Scanner;

public class PalindromeInt {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scr.nextInt();
        int rev=0, rem=0, temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            rev=rev*10 + rem;

        }
        System.out.println(rev);
        if(rev==temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
