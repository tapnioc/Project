package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards extends GroupOfCards {

    private ArrayList<CardAttributes> cards;

    /**
     * Creates the complete deck with 52 normal cards
     */
    public void generateDeck() {
        cards = new ArrayList<>();

        for (CardAttributes.value v : CardAttributes.value.values()) {

            for (CardAttributes.suit s : CardAttributes.suit.values()) {
                cards.add(new CardAttributes(s, v));
            }
        }
    }

    /**
     * Constructor
     */
    public DeckOfCards() {
        super();
    }

    /**
     *
     * @param numberOfCards
     * @return an array of removed cards from the deck
     */
    public ArrayList<CardAttributes> getCards(int numberOfCards) {
        ArrayList cardsRemoved = new ArrayList();
        if (numberOfCards <= cards.size()) {
            for (int i = 0; i < numberOfCards; i++) {
                cardsRemoved.add(cards.remove(0));
            }
        }
        return cardsRemoved;
    }

    /**
     *
     * @return returns the card on top of the deck, if there is no card it returns null
     */
    public CardAttributes getCardOnTop() {
        if (cards.size() > 0) {
            return cards.remove(0);
        } else {
            return null;
        }
    }

    /**
     *
     * @return the number of cards on the deck, if there are not cards left it returns 0
     */
    public int getDeckSize() {
        if (cards != null) {
            return this.cards.size();
        }
        return 0;
    }

    /**
     * shuffles the deck
     */
    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(ArrayList<CardAttributes> cards) {
        this.cards = cards;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "";
    }
}
