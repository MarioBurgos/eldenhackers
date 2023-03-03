package com.eldenhackers.game;

import com.eldenhackers.classes.Character;
import com.eldenhackers.classes.Warrior;
import com.eldenhackers.classes.Wizard;
import com.eldenhackers.menus.Menu;
import com.eldenhackers.utilities.AnsiColors;
import com.eldenhackers.utilities.CustomRandomGenerator;
import com.eldenhackers.utilities.CustomScanner;

import java.util.Scanner;

public class Game {
    private Character player1;
    private Character player2;
    private CustomScanner customScanner = new CustomScanner();

    /**
     * Runs a Game depending on the user selection.
     * GameType1 for random character selection, and gameType2 for characters selected by the players.
     *
     * @param gameType
     * @throws InterruptedException
     */
    public void launchGame(int gameType) throws InterruptedException {
        Integer round = 1;
        if (gameType == 1) {
            player1 = selectRandomPlayer(1);
            player2 = selectRandomPlayer(2);
        } else if (gameType == 2) {
            player1 = selectPlayer(1);
            player2 = selectPlayer(2);
        }


        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + player1.getStats() + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + player2.getStats());
        Menu.getReady();

        do {
            System.out.println(AnsiColors.RED + "\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  R O U N D  " + round + AnsiColors.RESET);
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t" + AnsiColors.GREEN + "··· S T A T S ·····························································" + AnsiColors.RESET);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + player1.getStats());
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + player2.getStats());
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t" + AnsiColors.YELLOW + "\n\n\t\t\t\t\t\t\t\t\t\t\t\t··· A C T I O N S ·························································" + AnsiColors.RESET);
            player1.attack(player2);
            player2.attack(player1);
            player1.checkAlive();
            player2.checkAlive();
            round++;
            Thread.sleep(1500);

        } while (player1.isAlive() == true && player2.isAlive() == true);


        System.out.println(AnsiColors.RED + "\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tE N D    O F    T H E    G A M E" + AnsiColors.RESET);
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + player1.getStats() + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + player2.getStats());

        checkWinner();

        System.out.println("Press 'Enter' to play again");
        Scanner s = new Scanner(System.in);
        s.nextLine();  // Cannot use our CustomScanner class, otherwise the user it will have to press 'Enter' twice
    }


    /* Checks who is alive and who is not.  Then calls a method that shows the winner message */
    private void checkWinner() {
        if (player1.isAlive()) {
            Menu.winnerMessage(player1);
        } else {
            Menu.winnerMessage(player2);
        }
    }

    /* Allows the players to create their character.  Returns a character of the selected class */
    private Character selectPlayer(int num) {
        int option = -1;
        Character player = null;
        do {
            Menu.selectCharacter(num);
            option = customScanner.scanInt();
            if (option == 1) {
                player = new Warrior();
                System.out.println("\nChoose your name!");
                player.setName(customScanner.scanString());
                //   System.out.println(player1.toString());
                option = 0;

            } else if (option == 2) {
                player = new Wizard();
                System.out.println("\nChoose your name!");
                player.setName(customScanner.scanString());
                // System.out.println(player1.toString());
                option = 0;
                System.out.println();

            } else {
                System.out.println("Character not found, choose 1 or 2");
            }
            System.out.println();
        } while (option != 1 && option != 2 && option != 0);
        //cS.closeS();
        return player;
    }

    /* Creates a random character.  Returns the character created randomly */
    private Character selectRandomPlayer(int num) {

        if (CustomRandomGenerator.getRangedInt(0, 100) % 2 == 0) {
            Character warrior = new Warrior();
            warrior.setName("Player" + num + " " + warrior.getCharacterType());
            return warrior;
        } else {
            Character wizard = new Wizard();
            wizard.setName("Player" + num + " " + wizard.getCharacterType());
            return wizard;
        }
    }

    /* getters and setters */
    public Character getPlayer1() {
        return player1;
    }

    public void setPlayer1(Character player1) {
        this.player1 = player1;
    }

    public Character getPlayer2() {
        return player2;
    }

    public void setPlayer2(Character player2) {
        this.player2 = player2;
    }
}
