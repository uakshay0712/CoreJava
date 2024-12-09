package CompetitiveCoding;

import java.util.HashMap;
import java.util.Scanner;

public class ToSumUsingMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int target = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-a[i])){
                System.out.println(map.get(target-a[i])+" "+ i);
                break;
            }
            else
                map.put(a[i],i);
        }
    }
}

