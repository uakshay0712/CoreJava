package CompetitiveCoding;

import java.util.Scanner;

public class ArthamaticSequenceSum {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int a,d,n;
        a=s.nextInt();
        d=s.nextInt();
        n=s.nextInt();
        int term=a,sum=a;
        for(int i=2;i<=n;i++){
            term+=d;
            sum+=term;
        }
        System.out.println(sum);
    }

}
