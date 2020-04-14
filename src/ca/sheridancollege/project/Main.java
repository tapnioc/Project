package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        String startGame;
        ArrayList<Player> players = null;
        
        do { //loop for checking whether player decides to play
            do {
                System.out.print("\nWelcome to GoFish! Play? (Y/N): ");
                startGame = input.next();

                if (!startGame.equalsIgnoreCase("Y") && !startGame.equalsIgnoreCase("N")) {
                    System.out.print("Play? (Y/N) ");
                }

            } while (!startGame.equalsIgnoreCase("Y") && !startGame.equalsIgnoreCase("N"));

            if (startGame.equalsIgnoreCase("Y")) {
                if (players == null) {//player creation
                    System.out.print("Enter player name: ");
                    String playerName = input.next();
                    System.out.println("Welcome, " + playerName + "!");
                    players = new ArrayList<>();
                    players.add(new PlayerOne(playerName));
                } else {
                    PlayerOne gPlayer;
                    for (Player player : players) {
                        gPlayer = (PlayerOne) player;
                        gPlayer.clearHandAndSets();
                    }
                }

                GoFish game = new GoFish("GoFish");
                game.setPlayers(players);
                game.play();
            }

        } while (startGame.equals("Y") && !startGame.equals("N"));
    }
}
