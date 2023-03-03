package com.eldenhackers.game;

import com.eldenhackers.classes.Character;
import com.eldenhackers.classes.Warrior;
import com.eldenhackers.classes.Wizard;
import com.eldenhackers.menus.Menu;
import com.eldenhackers.utilities.AnsiColors;
import com.eldenhackers.utilities.CustomScanner;

import java.util.random.RandomGenerator;

public class Game {
    private Character player1;
    private Character player2;
    private CustomScanner cS = new CustomScanner();

    /**
     * Runs a Game depending on the user selection.
     * GameType1 for random character selection, and gameType2 for characters selected by the players.
     * @param gameType
     * @throws InterruptedException
     */
    public void launchGame(int gameType) throws InterruptedException {

        if (gameType == 1) {
            player1 = selectRandomPlayer(1);
            player2 = selectRandomPlayer(2);
        } else if (gameType == 2) {
            player1 = selectPlayer(1);
            player2 = selectPlayer(2);
        }

        System.out.println(player1.getStats() + "\n" + player2.getStats());
        Menu.getReady();

        do {
            System.out.println(AnsiColors.GREEN + "·· S T A T S ·························································" + AnsiColors.RESET);
            System.out.println(player1.getStats());
            System.out.println(player2.getStats());
            System.out.println(AnsiColors.YELLOW + "\n\n·· A C T I O N S ·····················································" + AnsiColors.RESET);
            player1.attack(player2);
            player2.attack(player1);
            player1.checkAlive();
            player2.checkAlive();
            System.out.println(AnsiColors.RED + "\n\n                E N D    O F    T H E    R O U N D\n\n" + AnsiColors.RESET);
            Thread.sleep(1500);

        } while (player1.isAlive() == true && player2.isAlive() == true);


        System.out.println(player1.getStats() + "\n" + player2.getStats());
        System.out.println(AnsiColors.RED + "\n\n                 E N D    O F    T H E    G A M E\n\n" + AnsiColors.RESET);

        checkWinner();

        System.out.println("Press 'Enter' to play again");
        cS.scanString();
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
            option = cS.scanInt();

            if (option == 1) {
                player = new Warrior();
                System.out.println("\nChoose your name!");
                player.setName(cS.scanString());
                //   System.out.println(player1.toString());
                option = 0;

            } else if (option == 2) {
                player = new Wizard();
                System.out.println("\nChoose your name!");
                player.setName(cS.scanString());
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

        if (RandomGenerator.getDefault().nextInt(0, 100) % 2 == 0) {
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
