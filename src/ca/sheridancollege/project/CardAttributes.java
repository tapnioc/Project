package ca.sheridancollege.project;

public class CardAttributes extends Card {

    //implementation taken from In-Class Exercise #2
    public enum value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    };

    public enum suit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    };
    private value value;
    private suit suit;

    public CardAttributes(suit c, value v) {
        this.suit = c;
        this.value = v;
    }

    public suit getSuit() {
        return suit;
    }

    public void setSuit(suit suit) {
        this.suit = suit;
    }

    public value getValue() {
        return value;
    }

    public void setValue(value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Suit:" + this.suit + " Value: " + this.value;
    }

}
