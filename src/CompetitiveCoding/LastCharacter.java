package CompetitiveCoding;

import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name= scr.next().toLowerCase();
        int lastIndex= name.length()-1;
        char c=name.charAt(lastIndex);
        System.out.println("Last name: "+c);
    }
}
