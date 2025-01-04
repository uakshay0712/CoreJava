package CompetitiveCoding;

import java.util.Scanner;

public class PrintXnumberofTimes {
    public static void print(int n, int X){
        for(int i=0;i<n;i++){
            System.out.print(X+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter X Number: ");
        int n= scr.nextInt();
        System.out.print("Enter N Number: ");
        int X=scr.nextInt();
        print(X,n);
    }
}
