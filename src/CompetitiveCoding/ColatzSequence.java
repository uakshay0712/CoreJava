package CompetitiveCoding;

import java.util.Scanner;

public class ColatzSequence {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int  n=scr.nextInt();

        while(n!=1){
            System.out.print(n+" ");

            if(n%2==0)
                n=n/2;
            else
                n=n*3+1;

        }
        System.out.println(n);

    }

}
