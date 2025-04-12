package homeworks;

import java.util.Scanner;

public class PrimeLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getNumberFromUser(scanner);
        int[] selectedNumbers = extractPrimesToArray(number);
        listPrimesUpToUserInput(selectedNumbers);
        System.out.println("Primes: " + countingPrimes(number));
    }

    public static void listPrimesUpToUserInput(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static int[] extractPrimesToArray(int validNumber) {
        int[] primes = new int[countingPrimes(validNumber)];
        int index = 0;
        for (int i = 2; i <= validNumber; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[index] = i;
                index++;
            }
        }
        return primes;
    }

    public static int countingPrimes(int validNumber) {
        int primeCount = 0;
        for (int i = 2; i <= validNumber; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static int getNumberFromUser(Scanner scanner) {
        int counter = 0;
        int number;
        do {
            number = getUserInput(scanner);
            if (number < 2 || number > 2_000_000_000) {
                System.out.println("Wrong input!");
                counter++;
            }
            if (counter == 6) {
                return -1;
            }
        } while (!(number >= 2 && number <= 2_000_000_000));
        return number;
    }

    public static int getUserInput(Scanner scanner) {
        System.out.println("Please enter a number between 2 and 2_000_000_000: ");
        return scanner.nextInt();
    }
}
