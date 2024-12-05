package CompetitiveCoding;

import java.util.Scanner;

public class CoPrime {
    public static boolean isCoPrime(int n1, int n2){
        for(int i=2;i<=n1 && i<=n2;i++)
            if(n1%i==0 && n2%i==0)
                return false;
        return true;

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();
        System.out.println(isCoPrime(n1, n2));
    }
}
