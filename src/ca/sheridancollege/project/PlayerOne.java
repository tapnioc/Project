package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayerOne extends Player {

    private CardHand hand;
    private ArrayList<CardAttributes> completedSets;

    /**
     * constructor
     *
     * @param name
     */
    public PlayerOne(String name) {
        super(name);
        hand = new CardHand();
        completedSets = new ArrayList<>();
    }

    /**
     * Adds the argument cards to the CardHand class property
     *
     * @param cards
     */
    public void addCardsToHand(ArrayList<CardAttributes> cards) {
        hand.addCards(cards);
    }

    /**
     * clears the player's hand so that a new game can be played
     */
    public void clearHandAndSets() {
        completedSets = new ArrayList<>();
        hand = new CardHand();
    }

    /**
     * "go fish" method: drawing a card from deck pile
     *
     * @param pool
     * @return the card fished, in case it needs to be printed in the context the method was called.
     */
    public CardAttributes fish(DeckOfCards pool) {
        CardAttributes card = pool.getCardOnTop();
        hand.addCard(card);
        return card;
    }

    /**
     * Prints in the console the players hand, displaying his name and all the cards by suit and value
     */
    public void showHand() {
        System.out.println("\n" + super.getPlayerID() + "'s hand:");
        for (CardAttributes card : hand.getCards()) {
            System.out.println(card.getValue().toString() + " OF " + card.getSuit().toString());
        }
    }

    /**
     * returns count of cards in hand
     *
     * @return
     */
    public int getNumberOfCardsInHand() {
        return hand.getCards().size();
    }

    @Override
    public void play() {
        System.out.println(super.getPlayerID() + "'s turn");
    }

    /**
     *
     * @param v
     * @return whether the hand contains a group of 4 of the given card value
     */
    public boolean checkHand(CardAttributes.value v) {
        int numberOfCards = 0;
        for (CardAttributes card : hand.getCards()) {
            if (card.getValue().equals(v)) {
                numberOfCards++;
            }
        }
        return numberOfCards == 4;
    }

    /**
     * loops through the player's hand and checks if it contains a complete set (4 cards of the same value) if any sets are present, they are removed from the hand added to the "completedSets" class variable
     */
    public void countSets() {
        ArrayList<CardAttributes> cardsToAddToCompletedPile = new ArrayList<>();;
        CardAttributes card, card1;

        //iterates through all the deck twice to check for groups of 4 for each card in the hand
        for (Iterator<CardAttributes> cards = hand.getCards().iterator(); cards.hasNext();) {
            int numberOfSimilars = 0;
            card = cards.next();
            for (Iterator<CardAttributes> cards1 = hand.getCards().iterator(); cards1.hasNext();) {
                card1 = cards1.next();
                if (card.getValue().equals(card1.getValue())) {
                    numberOfSimilars++;
                }
                //if there are 4 cards of the same value, add them all to the auxiliary ArrayList of cards
                if (numberOfSimilars == 4) {
                    if (!cardsToAddToCompletedPile.contains(card1)) {
                        cardsToAddToCompletedPile.add(card1);
                    }
                    if (!cardsToAddToCompletedPile.contains(card)) {
                        cardsToAddToCompletedPile.add(card);
                    }
                }
            }
        }
        if (cardsToAddToCompletedPile.size() > 0) {
            for (Iterator<CardAttributes> iterator = cardsToAddToCompletedPile.iterator(); iterator.hasNext();) {
                completedSets.add(hand.getCards().remove(hand.getCards().indexOf(iterator.next())));
            }
        }
    }

    /**
     * prints to the console all the completed sets the player has
     */
    public void printCompletedSets() {
        if (completedSets.size() > 0) {
            for (int i = 0; i < completedSets.size(); i = i + 4) {
                System.out.printf("\n%s has a full set of %s", super.getPlayerID(), completedSets.get(i).getValue());
            }
        }
    }

    /**
     * @return the number of completed sets the player has
     */
    public int getSets() {
        countSets();
        return completedSets.size() / 4;
    }

    /**
     *
     * @param value
     * @return an ArrayList containing all the cards the player had with the same value
     */
    public ArrayList<CardAttributes> giveCards(CardAttributes.value value) {
        ArrayList<CardAttributes> cardsToGive = new ArrayList<>();
        CardAttributes card;
        ArrayList<CardAttributes> cardsToRemove = new ArrayList<>();

        //adds to cardsToRemove and iterates all the hand, an auxiliary array of the cards matched, so they can be removed later
        for (Iterator<CardAttributes> cards = hand.getCards().iterator(); cards.hasNext();) {
            card = cards.next();
            //System.out.println(card.getValue());
            if (card.getValue() == value) {
                cardsToRemove.add(card);
            }
        }

        //card transfer from one hand to another
        for (Iterator<CardAttributes> iterator = cardsToRemove.iterator(); iterator.hasNext();) {
            cardsToGive.add(hand.getCards().remove(hand.getCards().indexOf(iterator.next())));
        }

        return cardsToGive;
    }
}
