package CompetitiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfWordsInSentence {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Scanner scr = new Scanner(System.in);
        String[] str = scr.nextLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            String a = str[i].toLowerCase();
            if (map.get(a) == null)
                map.put(a, 1);
            else
                map.put(a, map.get(a) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            }
         }

    }
