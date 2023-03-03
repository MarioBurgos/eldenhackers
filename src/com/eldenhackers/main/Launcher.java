package com.eldenhackers.main;

import com.eldenhackers.game.Game;
import com.eldenhackers.menus.Menu;
import com.eldenhackers.utilities.CustomScanner;

public class Launcher {
    public static void main(String[] args) {

        int option = -1;
        CustomScanner customScanner = new CustomScanner();
        Game launcher = new Game();

        do {
            Menu.mainMenu();
            option = customScanner.scanInt();
            switch (option) {
                case 1:
                    try {
                        launcher.launchGame(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    try {
                        launcher.launchGame(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    Menu.credits();
                    System.out.println("\nPress 'Enter' to go back to Main menu");
                    customScanner.scanString();
                    break;
                default:
            }
        } while (option != 0);

        customScanner.closeScanner();
    }
}