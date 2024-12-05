package CompetitiveCoding;

import java.util.Scanner;

public class ZigZagNumberPattern {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==i || j==2*n-i)
                    System.out.print(j);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
