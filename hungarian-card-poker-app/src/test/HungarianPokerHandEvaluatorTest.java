package test;

import exception.InvalidHandException;
import logic.HandRank;
import logic.HungarianPokerHandEvaluator;
import model.Card;
import model.Hand;
import model.HungarianCardValue;
import model.HungarianSuit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HungarianPokerHandEvaluatorTest {
    @ParameterizedTest
    @MethodSource("pokerHands")
    void testPoker(Hand hand) {
        HungarianPokerHandEvaluator evaluator = HungarianPokerHandEvaluator.getInstance();
        assertEquals(HandRank.POKER, evaluator.evaluate(hand));
    }

    static Stream<Hand> pokerHands() throws InvalidHandException {
        return Stream.of(new Hand(List.of(
                new Card(HungarianCardValue.VII, HungarianSuit.MAKK),
                new Card(HungarianCardValue.VII, HungarianSuit.TOK),
                new Card(HungarianCardValue.VII, HungarianSuit.ZOLD),
                new Card(HungarianCardValue.VII, HungarianSuit.PIROS),
                new Card(HungarianCardValue.ASZ, HungarianSuit.MAKK),
                new Card(HungarianCardValue.KIRALY, HungarianSuit.TOK),
                new Card(HungarianCardValue.FELSO, HungarianSuit.ZOLD)
        )));
    }

    @ParameterizedTest
    @MethodSource("flushHands")
    void testFlush(Hand hand) {
        HungarianPokerHandEvaluator evaluator = HungarianPokerHandEvaluator.getInstance();
        assertEquals(HandRank.FLUSH, evaluator.evaluate(hand));
    }

    static Stream<Hand> flushHands() throws InvalidHandException {
        return Stream.of(new Hand(List.of(
                new Card(HungarianCardValue.VII, HungarianSuit.MAKK),
                new Card(HungarianCardValue.VIII, HungarianSuit.MAKK),
                new Card(HungarianCardValue.IX, HungarianSuit.MAKK),
                new Card(HungarianCardValue.X, HungarianSuit.MAKK),
                new Card(HungarianCardValue.ALSO, HungarianSuit.MAKK),
                new Card(HungarianCardValue.FELSO, HungarianSuit.MAKK),
                new Card(HungarianCardValue.KIRALY, HungarianSuit.MAKK))));
    }

    @ParameterizedTest
    @MethodSource("almostFlushHands")
    void testAlmostFlush(Hand hand) {
        HungarianPokerHandEvaluator evaluator = HungarianPokerHandEvaluator.getInstance();
        assertEquals(HandRank.ALMOST_FLUSH, evaluator.evaluate(hand));
    }

    static Stream<Hand> almostFlushHands() throws InvalidHandException {
        return Stream.of(
                new Hand(List.of(
                        new Card(HungarianCardValue.VII, HungarianSuit.ZOLD),
                        new Card(HungarianCardValue.VIII, HungarianSuit.ZOLD),
                        new Card(HungarianCardValue.IX, HungarianSuit.ZOLD),
                        new Card(HungarianCardValue.X, HungarianSuit.ZOLD),
                        new Card(HungarianCardValue.ALSO, HungarianSuit.MAKK),
                        new Card(HungarianCardValue.FELSO, HungarianSuit.TOK),
                        new Card(HungarianCardValue.KIRALY, HungarianSuit.PIROS)
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("nothingHands")
    void testNothing(Hand hand) {
        HungarianPokerHandEvaluator evaluator = HungarianPokerHandEvaluator.getInstance();
        assertEquals(HandRank.NOTHING, evaluator.evaluate(hand));
    }

    static Stream<Hand> nothingHands() throws InvalidHandException {
        return Stream.of(
                new Hand(List.of(
                        new Card(HungarianCardValue.VII, HungarianSuit.MAKK),
                        new Card(HungarianCardValue.VIII, HungarianSuit.TOK),
                        new Card(HungarianCardValue.IX, HungarianSuit.ZOLD),
                        new Card(HungarianCardValue.X, HungarianSuit.PIROS),
                        new Card(HungarianCardValue.ALSO, HungarianSuit.MAKK),
                        new Card(HungarianCardValue.FELSO, HungarianSuit.TOK),
                        new Card(HungarianCardValue.KIRALY, HungarianSuit.ZOLD)
                ))
        );
    }

}