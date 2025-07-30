package cf_smalltasks.emaillistmanager;

import java.util.HashSet;
import java.util.Set;

public class EmailListManager {
    private Set<String> availableEmails = new HashSet<>();

    public Set<String> getAvailableEmails() {
        return availableEmails;
    }

    public boolean addEmail(String email) {
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format: " + email);
            return false;
        }
        return availableEmails.add(email);
    }


    public boolean updateEmail(String oldEmail, String newEmail) {
        if (!isValidEmail(oldEmail)) {
            System.out.println("Invalid old email format: " + oldEmail);
            return false;
        }
        if (!isValidEmail(newEmail)) {
            System.out.println("Invalid new email format: " + newEmail);
            return false;
        }
        if (availableEmails.contains(oldEmail) && !availableEmails.contains(newEmail)) {
            availableEmails.remove(oldEmail);
            availableEmails.add(newEmail);
            return true;
        }
        return false;
    }

    public boolean deleteEmail(String email) {
        if (!availableEmails.contains(email)) {
            System.out.println("Email not found: " + email);
            return false;
        }
        availableEmails.remove(email);
        return true;
    }

    public boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email != null && email.matches(regex);
    }
}