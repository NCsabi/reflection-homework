package lister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SievePrimeLister implements PrimeLister {

    private boolean[] sieve = new boolean[0];
    private int currentMax = 1;

    @Override
    public List<Integer> generatePrime(int n) {
        if (n > currentMax) {
            extendSieve(n);
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) primes.add(i);
        }
        return primes;
    }

    private void extendSieve(int n) {
        sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }
        currentMax = n;
    }
}
