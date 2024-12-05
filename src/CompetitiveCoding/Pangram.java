package CompetitiveCoding;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str = str.toLowerCase();
        int check = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                check = 1;
                break;
            }
        }
        if (check == 1)
            System.out.println("false");
        else
            System.out.println("true");
    }
}
