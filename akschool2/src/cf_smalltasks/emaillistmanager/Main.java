package cf_smalltasks.emaillistmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailListManager manager = new EmailListManager();
        Scanner scanner = new Scanner(System.in);

        while (true) { //végtelen ciklus amig meg nem állítom(break vagy return, vagy változóba mentve true-->false)
            System.out.println("Select a number:  Number 1: Add new email, Number 2: List emails, Number 3: Refresh emails, Number 4: Delete emails, Number 5: Exit");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    int counter = 0;
                    while (counter < 3) {
                        System.out.println("Enter an email address: ");
                        String email = scanner.nextLine();
                        //nem tudom pontosan hogy az isValidEmail logikát itt vagy a másik osztályban szabályosabb-e megvalósítani...
                        if (!manager.isValidEmail(email)) {
                            System.err.println("Invalid email format. Try again!");
                            counter++;
                            continue;
                        }
                        if (manager.getAvailableEmails().contains(email)) {
                            System.err.println("The email is already in the list, please enter a new email address: ");
                            counter++;
                        } else {
                            manager.addEmail(email);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Email list: ");
                    for (String email : manager.getAvailableEmails()) {
                        System.out.println(email);
                    }
                    break;
                case 3:
                    System.out.println("Enter your old email address: ");
                    String oldEmailAddress = scanner.nextLine();
                    System.out.println("Enter your new email address: ");
                    String newEmailAddress = scanner.nextLine();
                    if (manager.updateEmail(oldEmailAddress, newEmailAddress)) {
                        System.out.println("Email updated successfully!");
                    } else {
                        System.out.println("Update failed!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the email address you want to delete: ");
                    String email = scanner.nextLine();
                    boolean deleted = manager.deleteEmail(email);
                    if (deleted) {
                        System.out.println("Email deleted successfully!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.err.println("Invalid option. Try again!");
            }
        }
    }
}
