package CompetitiveCoding;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstMissingPositiveInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int dum = 1;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && dum == a[i]) {
                dum++;
            } else if (a[i] > 0 && a[i] > dum) {
                break;
            }

        }
        System.out.println(dum);
    }
}
