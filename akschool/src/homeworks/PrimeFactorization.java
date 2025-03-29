package homeworks;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        int number = 28;
        System.out.println(primeFactorization(number));
    }

    public static List<Boolean> isInitializeBooleanList(int number) {
        List<Boolean> isPrim = new ArrayList<>();
        isPrim.add(false);
        isPrim.add(false);
        for (int i = 2; i < number; i++) {
            isPrim.add(true);
        }
        return isPrim;
    }

    public static List<Boolean> isSievePrimeFlags(int number) {
        List<Boolean> isPrimes = isInitializeBooleanList(number);
        for (int i = 2; i < isPrimes.size(); i++) {
            if (isPrimes.get(i)) {
                for (int j = i * i; j < isPrimes.size(); j += i) {
                    isPrimes.set(j, false);
                }
            }
        }
        return isPrimes;
    }

    public static List<Integer> generatePrimeList(int number) {
        List<Boolean> prime = isSievePrimeFlags(number);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < prime.size(); i++) {
            if (prime.get(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static List<Integer> primeFactorization(int number) {
        List<Integer> primes = generatePrimeList(number);
        List<Integer> primeFactors = new ArrayList<>();
        for (int prime : primes)
            while (number % prime == 0) {
                primeFactors.add(prime);
                number /= prime;
            }
        return primeFactors;
    }
}
