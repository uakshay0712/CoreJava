package CompetitiveCoding;

import java.util.Scanner;

public class DeleteAllVowlsFromAString {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
