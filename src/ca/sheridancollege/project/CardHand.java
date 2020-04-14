package ca.sheridancollege.project;

import java.util.ArrayList;

public class CardHand extends GroupOfCards {

    private ArrayList<CardAttributes> cards;

    /**
     * Constructor
     *
     * @param size
     */
    CardHand() {
        super();
        cards = new ArrayList<>();
    }

    /**
     * @return the cards in the hand
     */
    public ArrayList<CardAttributes> getCards() {
        return cards;
    }

    /**
     * @param cards the cards to add to the hand
     */
    public void addCards(ArrayList<CardAttributes> cards) {
        this.cards.addAll(cards);
    }

    /**
     *
     * @param card
     * @return the card object removed from the hand
     */
    public CardAttributes removeCard(CardAttributes card) {
        return cards.remove(cards.indexOf(card));
    }

    /**
     * Adds the GoFishCard object to the array of cards called "cards"
     *
     * @param card
     */
    public void addCard(CardAttributes card) {
        cards.add(card);
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
