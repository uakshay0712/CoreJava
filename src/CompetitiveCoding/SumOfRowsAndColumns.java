package CompetitiveCoding;

import java.util.Scanner;

public class SumOfRowsAndColumns {

        public static void main(String[] args) {
            Scanner scr= new Scanner(System.in);
            int n=scr.nextInt();
            int m=scr.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    System.out.print((i+j)+" ");
                }
                System.out.println();
        }
    }
}
