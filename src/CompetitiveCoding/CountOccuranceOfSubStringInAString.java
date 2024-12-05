package CompetitiveCoding;

import java.util.Scanner;

public class CountOccuranceOfSubStringInAString {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str1 = scr.nextLine();
        String str2 = scr.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str1.indexOf(str2, index)) != -1) {
            count++;
            index++;
        }
        System.out.println(count);
    }
}
