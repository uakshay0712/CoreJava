package CompetitiveCoding;

import java.util.Scanner;

public class ReminderWithOutModulus {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a=scr.nextInt();
        int b=scr.nextInt();

        a=a-b*(a/b);

        System.out.println(a);
    }
}
