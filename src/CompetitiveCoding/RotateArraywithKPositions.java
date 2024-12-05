package CompetitiveCoding;

import java.util.Scanner;

public class RotateArraywithKPositions {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = scr.nextInt();
        int n = scr.nextInt();
        for (int i = 0; i < n; i++) {
            int j, lastElement;
            lastElement = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = lastElement;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
