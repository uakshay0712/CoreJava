package CompetitiveCoding;

import java.util.Scanner;

public class CountNumberOfDigitsInGivenNumber {

        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int n= scr.nextInt();
            int count =0;
            if(n==0)
                System.out.println("1");
            else{
                while (n!=0 ){
                    n=n/10;
                    count++;
                }
                System.out.println(count);
        }
    }
}
