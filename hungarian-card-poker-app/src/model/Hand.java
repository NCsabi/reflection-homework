package model;

import exception.InvalidHandException;

import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand(List<Card> cards) throws InvalidHandException {
        if (cards.size() != 7) {
            throw new InvalidHandException("Hands size must be 7");
        }
        this.cards = cards;
    }

    public List<Card> getCards() {
        return List.copyOf(cards);
    }
}
