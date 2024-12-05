package CompetitiveCoding;

import java.util.Scanner;

public class AverageOfListOfNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        int [] array = new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            array[i]=scr.nextInt();
        }
        for(int i=0;i<n;i++){
            sum += array[i];
        }
        System.out.println(sum/n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
