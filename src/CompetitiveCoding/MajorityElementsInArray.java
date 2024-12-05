package CompetitiveCoding;

import java.util.Scanner;

public class MajorityElementsInArray {
    public static int isFrequency(int[]ar,int n){
        int count = 0;
        for(int i=0;i<ar.length;i++)
            if(ar[i]==n)
                count++;
        return count;
    }

    public static void main(String[] args) {

        Scanner  scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] ar = new int[n];
        for(int i =0;i<n;i++)
            ar[i] =scr.nextInt();
        for(int i =0;i<=n-2;i++){
            if((isFrequency(ar,ar[i]))>=n/2)
                System.out.println(ar[i]);
            break;
        }
    }
}
