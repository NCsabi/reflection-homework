package cf_smalltasks.emaillistmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailListingManagerTest {
    private EmailListManager manager;

    @BeforeEach
    public void setup() {
        manager = new EmailListManager();
    }

    @Test
    public void shouldAddEmailToLIstWhenEmailIsValid() {
        assertTrue(manager.addEmail("test@mail.com"));
        assertTrue(manager.getAvailableEmails().contains("test@mail.com"));
    }

    @Test
    public void shouldRejectEmailWhenFormatIsInvalid() {
        assertFalse(manager.addEmail("false.email"));
        assertFalse(manager.getAvailableEmails().contains("false.email"));
    }

    @Test
    public void shouldNotAddEmailWhenEmailAlreadyExists() {
        manager.addEmail("duplicate@email.com");
        assertFalse(manager.addEmail("duplicate@email.com"));
    }

    @Test
    public void shouldReplaceOldEmailWithNewOneWhenUpdateIsCalled() {
        manager.addEmail("old@email.com");
        assertTrue(manager.updateEmail("old@email.com", "new@email.com"));
        assertFalse(manager.getAvailableEmails().contains("old@email.com"));
        assertTrue(manager.getAvailableEmails().contains("new@email.com"));
    }

    @Test
    public void shouldRemoveEmailFromListWhenDeleteIsCalled() {
        manager.addEmail("test@email.com");
        assertTrue(manager.deleteEmail("test@email.com"));
        assertFalse(manager.getAvailableEmails().contains("test@email.com"));
    }

    @Test
    public void shouldReturnTrueForValidEmailFormatAndFalseOtherwise() {
        assertTrue(manager.isValidEmail("valid@email.com"));
        assertFalse(manager.isValidEmail("invalidEmail.com"));
        assertFalse(manager.isValidEmail(null));
    }
}
