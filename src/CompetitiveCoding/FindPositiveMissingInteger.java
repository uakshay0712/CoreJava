package CompetitiveCoding;

import java.util.Arrays;
import java.util.Scanner;

public class FindPositiveMissingInteger {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        int n=scr.nextInt(); // array size
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]= scr.nextInt(); // adding values to array

        Arrays.sort(a); //sorting the array
        int min=1;
        for(int i=0;i<n;i++){
            if(a[i]>0 && min==a[i]){
                min++;
            }else if(a[i]>0 && a[i]>min)
                break;

        }
        System.out.println(min);
    }
}
