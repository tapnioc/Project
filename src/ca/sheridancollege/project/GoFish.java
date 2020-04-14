package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish extends Game {

    DeckOfCards pool;
    PlayerOne computer;
    PlayerOne player;
    String playerGuess;
    boolean validGuess;

    /**
     * Constructor
     *
     * @param givenName
     */
    public GoFish(String givenName) {
        super(givenName);
        computer = new PlayerOne("Computer");
        pool = new DeckOfCards();
        pool.generateDeck();
        pool.shuffle();
    }

    /**
     * Implementation of game sequence
     */
    @Override
    public void play() {
        player = ((PlayerOne) super.getPlayers().get(0));

        Scanner input = new Scanner(System.in);
        boolean playerHadToFish, computerHadToFish;
        computer.addCardsToHand(pool.getCards(7));
        player.addCardsToHand(pool.getCards(7));

        CardAttributes.value userChoice = null, computerChoice = null;
        ArrayList<CardAttributes> cardsTakenFromComputer;
        ArrayList<CardAttributes> cardsGivenTocomputer;

        do {

            //loop until "go fish" move made
            do {
                if (pool.getDeckSize() == 0 && computer.getNumberOfCardsInHand() == 0) {
                    break;
                }
                do {
                    playerHadToFish = false;

                    player.showHand();
                    //debugging tool -- tracking computer hand
                    //computer.showHand();

                    System.out.print("\n" + player.getPlayerID() + " please ask computer for a card: ");

                    playerGuess = input.next().toUpperCase();

                    for (CardAttributes.value v : CardAttributes.value.values()) {
                        if (v.toString().equals(playerGuess)) {
                            validGuess = true;
                            userChoice = v.valueOf(playerGuess);
                            break;
                        } else {
                            validGuess = false;
                        }
                    }
                    //check 
                    if (!validGuess) {
                        System.out.print("\nInvalid card value. Try again: ");
                    }

                } while (!validGuess);

                cardsTakenFromComputer = computer.giveCards(userChoice);
                //checks if the computer had the card the user asked for
                //if yes, add the card(s) to the player's hand
                if (cardsTakenFromComputer.size() > 0) {
                    System.out.printf("Nice! The computer had %d %s(S)\n", cardsTakenFromComputer.size(), userChoice.name());
                    player.addCardsToHand(cardsTakenFromComputer);
                } else {
                    playerHadToFish = true;
                    if (pool.getDeckSize() > 0) {
                        System.out.printf("The computer does not have a %s, go fish!\n", userChoice.name());
                        System.out.printf("You fished a %s", player.fish(pool).getValue());
                    }
                }
                player.countSets();
                player.printCompletedSets();
            } while (!playerHadToFish);

            //loops until the computer has to fish, which means it is the end of its turn
            do {
                //computer's turn
                computerHadToFish = false;

                if (pool.getDeckSize() == 0 && player.getNumberOfCardsInHand() == 0) {
                    break;
                }

                int computerChoiceNumber = (int) (Math.random() * 13);
                switch (computerChoiceNumber) {
                    case 0:
                        computerChoice = CardAttributes.value.valueOf("TWO");
                        break;
                    case 1:
                        computerChoice = CardAttributes.value.valueOf("THREE");
                        break;
                    case 2:
                        computerChoice = CardAttributes.value.valueOf("FOUR");
                        break;
                    case 3:
                        computerChoice = CardAttributes.value.valueOf("FIVE");
                        break;
                    case 4:
                        computerChoice = CardAttributes.value.valueOf("SIX");
                        break;
                    case 5:
                        computerChoice = CardAttributes.value.valueOf("SEVEN");
                        break;
                    case 6:
                        computerChoice = CardAttributes.value.valueOf("EIGHT");
                        break;
                    case 7:
                        computerChoice = CardAttributes.value.valueOf("NINE");
                        break;
                    case 8:
                        computerChoice = CardAttributes.value.valueOf("TEN");
                        break;
                    case 9:
                        computerChoice = CardAttributes.value.valueOf("JACK");
                        break;
                    case 10:
                        computerChoice = CardAttributes.value.valueOf("QUEEN");
                        break;
                    case 11:
                        computerChoice = CardAttributes.value.valueOf("KING");
                        break;
                    case 12:
                        computerChoice = CardAttributes.value.valueOf("ACE");
                        break;
                }

                System.out.println("\n\nThe computer chose: " + computerChoice);
                cardsGivenTocomputer = player.giveCards(computerChoice);

                if (cardsGivenTocomputer.size() > 0) {
                    System.out.printf("The computer took your %d %s(S)", cardsGivenTocomputer.size(), computerChoice.name());
                    computer.addCardsToHand(cardsGivenTocomputer);
                } else {
                    computerHadToFish = true;
                    if (pool.getDeckSize() > 0) {
                        System.out.println("\nThe computer went fishing!");
                        computer.fish(pool);
                    }
                }
                computer.countSets();
                computer.printCompletedSets();
            } while (!computerHadToFish);

        } while (pool.getDeckSize() > 0 || player.getNumberOfCardsInHand() > 0 || computer.getNumberOfCardsInHand() > 0);

        declareWinner();
    }

    @Override
    public void declareWinner() {
        computer.countSets();
        player.countSets();

        if (computer.getSets() > player.getSets()) {
            System.out.printf("\nBetter luck next time! the computer had %d sets, and you had %d sets", computer.getSets(), player.getSets());
        } else {
            System.out.printf("\nYou won! You had %d set(s), and the computer had %d set(s)", player.getSets(), computer.getSets());
        }
    }
}
