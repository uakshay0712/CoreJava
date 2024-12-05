package CompetitiveCoding;

import java.util.Scanner;

public class PairsInAListAddUpToSum {
    public static boolean isPairs(int n,int [] arr, int t){
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i]+arr[j]==t)
                    return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }
        int t = scr.nextInt();
        System.out.println(isPairs(n, arr, t));
    }
}
