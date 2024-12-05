package CompetitiveCoding;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetterOrDigit(str.charAt(i)))
                sb.append(str.charAt(i));

        if (sb.toString().equalsIgnoreCase(sb.reverse().toString()))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
