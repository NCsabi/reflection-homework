package oop_videogamestore;

public class Game {
    private String title;
    private String genre;
    private double price;
    private boolean inStock;

    public Game(String title, String genre, double price, boolean isStock) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.inStock = isStock;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return String.format("Title: %s Genre: %s Price: %.2f isStock: %s",
                title, genre, price, inStock ? "Yes" : "No"
        );
    }
}
