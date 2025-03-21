package homeworks;

import java.util.Scanner;

public class SquareNumberLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getNumberFromUser(scanner);
        getSquareNumberList(number);
    }

    public static int getUserInput(Scanner scanner) {
        System.out.println("Please enter a number between 2 and 2_000_000_000: ");
        return scanner.nextInt();
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
        } while (number < 2 || number > 2_000_000_000);
        return number;
    }

    public static void getSquareNumberList(int number) {
        int i = 1;
        while (i * i <= number) {
            System.out.print(i * i + " ");
            i++;
        }
    }
}

