package CompetitiveCoding;

import java.util.Scanner;

public class ToSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        int [] a = new int[n];

        for(int i=0;i<n;i++)
            a[i]=scr.nextInt();
        int target=scr.nextInt();

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
