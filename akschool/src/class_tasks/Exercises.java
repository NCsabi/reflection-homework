package class_tasks;

import java.util.Scanner;

public class Exercises {

    //Ha szürke egy változó az intelliJ-ben az azért van mert nem használjuk.

    static int staticFieldExample;
    int instanceFieldExample; //példányszintű változó

    static Scanner sc = new Scanner(System.in);
    //Scanner = Scanner osztály
    //sc = egy konkrét példány, amit ebből létrehoztunk. (példányosítás)


    public static void main(String[] args) { //paraméter változó
        int localVariableExample = 0; //helyi változó

        System.out.printf("%30s", "hello"); //30 karakternyi helyet hagy ki a "hello"-szövegnek, a kimaradt helyeket feltölti szóközzel jobbra rendezve.
        System.out.println();
        System.out.printf("%-30s gjgjtutudhdh %30s", "hello", "world"); //a %-30s balra rendez egy stringet, aztán szöveg aztá jobbra rendezett string.
        System.out.println();

        System.out.println("Please enter name and email: ");
        String name = sc.nextLine();
        String email = sc.nextLine();

        String text = "_";
        String divider;
        if (name.length() > email.length()) {
            divider = text.repeat(name.length() + 2);
        } else {
            divider = text.repeat(email.length());
        }


        System.out.println("Enter first number");
        System.out.print("Number one: ");
        int firstNumber = sc.nextInt();  //scanner input kérése
        System.out.println("Enter second number");
        System.out.print("Number two: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number");
        System.out.print("Number three: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first number is the greatest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The second number is the greatest");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The third number is the greatest");
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first and the second numbers are the greatest");
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            System.out.println("The first and the third numbers are the greatest");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second and the third numbers are the greatest");
        } else {
            System.out.println("All three numbers are equal");
        }
    }
}