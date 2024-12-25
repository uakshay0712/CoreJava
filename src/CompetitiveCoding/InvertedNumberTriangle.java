package CompetitiveCoding;

import java.util.Scanner;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        for(int i=1;i<=n;i++){
            int t=1;
            for(int j=i;j<=n;j++,t++){

                System.out.print(t+" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
