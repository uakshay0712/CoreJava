package CompetitiveCoding;

import java.util.Scanner;

public class GeometricPogression {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a,r,n;
        a=s.nextInt();
        r=s.nextInt();
        n=s.nextInt();
        int sum=1,term=1;
        for(int i=2;i<=n;i++){
            term*=r;
            sum+=term;
        }
        sum=sum*a;
        System.out.println(sum);

    }
}
