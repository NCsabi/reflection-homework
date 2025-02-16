import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 7: ");

        byte number = sc.nextByte();

        sc.close();

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.err.println("The given number is not between 1 and 7");
        }
    }

}
