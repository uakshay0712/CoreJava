package CompetitiveCoding;
import java.util.Scanner;

public class NoDivBySumOfItsDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        int abs=Math.abs(n);
        int sum=0;
        int temp=abs;

        while(temp>0){

            sum += temp%10;
            temp/=10;
        }
        if(abs%sum==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
