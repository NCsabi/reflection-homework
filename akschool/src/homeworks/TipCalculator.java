package homeworks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        int[] prices = {2000, 250, 300, 50, 250};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please specify how many percent tip you would like to give: ");
        int number = scanner.nextInt();
        System.out.println("Amount of tip: " + calculateTip(prices, number));
    }

    public static int calculatePercent(int num) {
        if (num < 10 || num > 80) {
            return -1;
        } else {
            return num;
        }
    }

    public static int addPrices(int[] prices) {
        int amount = 0;
        for (int price : prices) {
            amount += price;
        }
        return amount;
    }

    public static int calculateTip(int[] prices, int tip) {
        if (calculatePercent(tip) == -1) {
            return -1;
        } else {
            return (addPrices(prices) * calculatePercent(tip)) / 100;
        }
    }
}
