package CompetitiveCoding;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        int i,j,k=1;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(j=1;j<=n-i+1;j++)
                System.out.print("* ");
            System.out.println();
        }

        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(j=1;j<=n-i+1;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
