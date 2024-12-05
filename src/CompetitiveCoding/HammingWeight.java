package CompetitiveCoding;

import java.util.Scanner;

public class HammingWeight {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int count=0;

        while(n>0){
            count =count +n%2;
            n=n/2;

        }
        System.out.println(count);
    }
}
