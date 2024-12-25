package CompetitiveCoding;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.print("Enter the String value: ");
        String str= scr.nextLine();
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }

        }
        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");

    }
}
