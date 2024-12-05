package CompetitiveCoding;

import java.util.Scanner;

public class CountAllSubarraysWithSumEqualToZero {
    public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n=scr.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=scr.nextInt();
            int count=0;
            for(int i=0;i<n;i++){
                int curr=0;
                for(int j=i;j<n;j++){
                    curr+=a[j];
                    if(curr==0)
                        count++;
                }
            }
            System.out.println(count);
    }
}
