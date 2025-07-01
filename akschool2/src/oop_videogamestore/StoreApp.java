package oop_videogamestore;


import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        Game game1 = new Game("Farming Simulator 25", "Simulator", 49.99, true);
        Game game2 = new Game("Baldur's Gate 3", "Fantasy", 59.99, true);
        Game game3 = new Game("Battlefield 5", "FPS", 50.00, false);

        Customer customer1 = new Customer("Kiss Attila");
        customer1.addFunds(100.95);
        Customer customer2 = new Customer("Nagy Szabolcs");
        customer2.addFunds(200.25);

        Store store = new Store(List.of(game1, game2, game3), List.of(customer1, customer2));

        store.listAvailableGames();
        store.sellGame("Baldur's Gate 3", "Kiss Attila");
        store.listCustomers();
        store.listAvailableGames();
    }
}
