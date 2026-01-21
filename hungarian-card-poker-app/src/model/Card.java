package model;

public class Card {
    private final HungarianCardValue value;
    private final HungarianSuit suit;

    public Card(HungarianCardValue value, HungarianSuit suit) {
        super();
        this.value = value;
        this.suit = suit;
    }

    public HungarianCardValue getValue() {
        return value;
    }

    public HungarianSuit getSuit() {
        return suit;
    }
}
