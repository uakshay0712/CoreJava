package CompetitiveCoding;

import java.util.Scanner;

public class StrongestNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        int sum=0;
        int temp=n;

        while(temp!=0){
            int digit=temp%10;
            int fact=1;

            for(int i=1;i<= digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==n)
            System.out.println("true");
        else
            System.out.print("false");
    }
}
