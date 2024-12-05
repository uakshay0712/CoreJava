package CompetitiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurancesOfElements {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scr.nextInt();

            if (map.get(a) == null)
                map.put(a, 1);
            else
                map.put(a, map.get(a) + 1);
        }
        int target = scr.nextInt();
        System.out.println(map.get(target));
    }
}
