package impl;

import api.PrimeLister;

import java.util.ArrayList;
import java.util.List;

public class SqrtPrimeLister implements PrimeLister {
    @Override
    public List<Integer> generatePrim(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes.add(i);
        }
        return primes;
    }
}
