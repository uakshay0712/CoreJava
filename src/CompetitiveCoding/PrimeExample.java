package CompetitiveCoding;

import java.util.ArrayList;

public class PrimeExample {
        public static ArrayList<Integer> sieve(int A) {
            ArrayList<Integer> prime = new ArrayList<>();
            boolean[] isPrime = new boolean[A + 1];

            for (int i = 2; i <= A; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= A; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= A; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (int i = 2; i <= A; i++) {
                if (isPrime[i]) {
                    prime.add(i);
                }
            }

            return prime;
        }
    }
