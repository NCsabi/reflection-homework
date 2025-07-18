public class PrimeCounter {
    public static void main(String[] args) {
        System.out.println("Number of prime numbers between 1000 and 2073: " + countingPrimes(1000, 2073));

    }

    public static int countingPrimes(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if(i < 2) continue;
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                counter++;
                System.out.println(i);
            }
        }
        return counter;
    }
}
