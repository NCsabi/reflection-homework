package oop_videogamestore;

import org.junit.Test;

import static org.junit.Assert.*;

public class VideoGameStoreTests {
    @Test
    public void testPurchaseFailsWhenNotEnoughMoney() {
        Store store = new Store();
        Game game = new Game("Baldur's Gate 3", "Fantasy", 59.99, true);
        Customer customer = new Customer("Kiss Attila");
        store.addGame(game);
        store.addCustomer(customer);

        store.sellGame("Baldur's Gate 3", "Kiss Attila");
        assertFalse(customer.getOwnedGames().contains(game));
        assertEquals(0.0, customer.getWalletBalance(), 0.01);
        assertTrue(game.isInStock());
    }

    @Test
    public void testPurchaseFailsWhenGameNotInStock() {
        Store store = new Store();
        Game game = new Game("Battlefield 5", "FPS", 50.00, false);
        Customer customer = new Customer("Nagy Szabolcs");
        customer.addFunds(100);
        store.addGame(game);
        store.addCustomer(customer);

        store.sellGame("Battlefield 5", "Nagy Szabolcs");
        assertFalse(customer.getOwnedGames().contains(game));
        assertEquals(100, customer.getWalletBalance(), 0.01);
    }

    @Test
    public void testPurchaseFailsWhenGameDoesNotExist() {
        Store store = new Store();
        Customer customer = new Customer("Teszt Elek");
        customer.addFunds(100.0);
        store.addCustomer(customer);

        boolean result = store.sellGame("Diablo", "Kiss Attila");

        assertFalse(result);
        assertTrue(customer.getOwnedGames().isEmpty());
        assertEquals(100.0, customer.getWalletBalance(), 0.01);
    }

    @Test
    public void testPurchaseIsSuccessful() {
        Store store = new Store();
        Game game = new Game("Farming Simulator 25", "Simulator", 49.99, true);
        Customer customer = new Customer("Nagy Szabolcs");
        customer.addFunds(100);

        store.addGame(game);
        store.addCustomer(customer);
        boolean result = store.sellGame("Farming Simulator 25", "Nagy Szabolcs");

        assertTrue(result);
        assertTrue(customer.getOwnedGames().contains(game));
        assertEquals(50.01, customer.getWalletBalance(), 0.01);
        assertFalse(game.isInStock());

    }
}