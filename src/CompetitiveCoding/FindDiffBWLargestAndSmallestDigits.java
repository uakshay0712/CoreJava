package CompetitiveCoding;

import java.util.Scanner;

public class FindDiffBWLargestAndSmallestDigits {
    public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n=scr.nextInt();
            int rem=0;
            int largestNumber=-99999999;
            int smallestNumber=99999999;
            int absValue=Math.abs(n);
            if(absValue<10){
                System.out.println(0);
            }else{
                while(absValue>0){
                    rem=absValue%10;
                    if(rem>largestNumber){
                        largestNumber=rem;
                    }
                    if(rem<smallestNumber){
                        smallestNumber=rem;
                    }
                    absValue/=10;
                }
                System.out.println(largestNumber-smallestNumber);
            }
    }
}
