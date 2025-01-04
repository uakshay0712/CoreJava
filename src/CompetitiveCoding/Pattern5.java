package CompetitiveCoding;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n= scr.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
