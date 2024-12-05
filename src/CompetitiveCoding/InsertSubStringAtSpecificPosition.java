package CompetitiveCoding;

import java.util.Scanner;

public class InsertSubStringAtSpecificPosition {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String str1 = scr.nextLine();
        int pos = scr.nextInt();
        StringBuffer sb = new StringBuffer(str);
        sb.insert(pos, str1);

        System.out.println(sb.toString());
    }
}
