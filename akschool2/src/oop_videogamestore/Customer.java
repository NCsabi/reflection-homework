package oop_videogamestore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double walletBalance;
    private List<Game> ownedGames;

    public Customer(String name) {
        this.name = name;
        this.walletBalance = 0;
        this.ownedGames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public List<Game> getOwnedGames() {
        return ownedGames;
    }

    public void addFunds(double amount) {
        walletBalance += amount;
    }

    public boolean purchaseGame(Game game) {
        if (!game.isInStock()) {
            System.out.println("The game is not available");
            return false;
        }
        if (walletBalance < game.getPrice()) {
            System.out.println("You don't have enough money");
            return false;
        }
        System.out.println(name + " successfully purchased " + game);
        addFunds(-game.getPrice());
        ownedGames.add(game);
        game.setInStock(false);
        return true;

    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s, Wallet Balance: %.2f",
                name, walletBalance
        );
    }
}
