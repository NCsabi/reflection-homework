package oop_videogamestore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Game> games;
    private List<Customer> registeredCustomers;

    public Store(List<Game> games, List<Customer> registeredCustomers) {
        this.games = games;
        this.registeredCustomers = registeredCustomers;
    }

    public Store() {
        this.games = new ArrayList<>();
        this.registeredCustomers = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void addCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

    public void listAvailableGames() {
        for (Game game : games) {
            if (game.isInStock()) {
                System.out.println(game);
            }
        }
    }

    public Game findGameByTitle(String title) {
        for (Game game : games) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        return null;
    }

    public Customer findCustomerByName(String name) {
        for (Customer customer : registeredCustomers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean sellGame(String gameTitle, String customerName) {
        Game game = findGameByTitle(gameTitle);
        if (game == null) {
            System.out.println("The game not found");
            return false;
        }
        Customer customer = findCustomerByName(customerName);
        if (customer == null) {
            System.out.println("Customer not found");
            return false;
        }
        return customer.purchaseGame(game);


    }

    public void listCustomers() {
        System.out.println("Customers: ");
        for (Customer customer : registeredCustomers) {
            System.out.println(customer);
        }
    }

}

