/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author Sivagama
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;

    /**
     * Constructor
     *
     * @param givenSize
     */
    public GroupOfCards() {

    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards() {
        return cards;
    }

    /**
     * shuffles the group of cards, changing the order randomly
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        if (cards != null) {
            return cards.size();
        }
        return 0;
    }

}//end class
