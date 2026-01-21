package logic;

import model.Card;
import model.Hand;
import model.HungarianCardValue;
import model.HungarianSuit;

import java.util.HashMap;
import java.util.Map;

public class HungarianPokerHandEvaluator {
    private static HungarianPokerHandEvaluator INSTANCE;

    private HungarianPokerHandEvaluator() {
    }

    public static HungarianPokerHandEvaluator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HungarianPokerHandEvaluator();
        }
        return INSTANCE;
    }

    public HandRank evaluate(Hand hand) {
        Map<HungarianCardValue, Integer> valueCount = new HashMap<>();
        Map<HungarianSuit, Integer> suitCount = new HashMap<>();
        for (Card card : hand.getCards()) {
            if (valueCount.containsKey(card.getValue())) {
                valueCount.put(card.getValue(), valueCount.get(card.getValue()) + 1);
            } else {
                valueCount.put(card.getValue(), 1);
            }
            if (suitCount.containsKey(card.getSuit())) {
                suitCount.put(card.getSuit(), suitCount.get(card.getSuit()) + 1);
            } else {
                suitCount.put(card.getSuit(), 1);
            }
        }
        for (int count : valueCount.values()) {
            if (count == 4) {
                return HandRank.POKER;
            }
        }
        for (int count : suitCount.values()) {
            if (count == 7) {
                return HandRank.FLUSH;
            } else if (count >= 4 && count <= 6) {
                return HandRank.ALMOST_FLUSH;

            }
        }
        return HandRank.NOTHING;
    }
}
