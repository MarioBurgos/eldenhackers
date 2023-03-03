package com.eldenhackers.menus;

import com.eldenhackers.classes.Character;
import com.eldenhackers.utilities.AnsiColors;
import com.eldenhackers.utilities.Emoji;

public class Menu {

    public static void mainMenu() {
        System.out.println(AnsiColors.YELLOW + "\n\n\n" +
                "==============================================================================================================================================================\n\n" +

                "\t   ▄████████  ▄█       ████████▄     ▄████████ ███▄▄▄▄          ▄█    █▄       ▄████████  ▄████████    ▄█   ▄█▄    ▄████████    ▄████████    ▄████████ \n" +
                "\t  ███    ███ ███       ███   ▀███   ███    ███ ███▀▀▀██▄       ███    ███     ███    ███ ███    ███   ███ ▄███▀   ███    ███   ███    ███   ███    ███ \n" +
                "\t  ███    █▀  ███       ███    ███   ███    █▀  ███   ███       ███    ███     ███    ███ ███    █▀    ███▐██▀     ███    █▀    ███    ███   ███    █▀  \n" +
                "\t ▄███▄▄▄     ███       ███    ███  ▄███▄▄▄     ███   ███      ▄███▄▄▄▄███▄▄   ███    ███ ███         ▄█████▀     ▄███▄▄▄      ▄███▄▄▄▄██▀   ███        \n" +
                "\t▀▀███▀▀▀     ███       ███    ███ ▀▀███▀▀▀     ███   ███     ▀▀███▀▀▀▀███▀  ▀███████████ ███        ▀▀█████▄    ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   ▀███████████ \n" +
                "\t  ███    █▄  ███       ███    ███   ███    █▄  ███   ███       ███    ███     ███    ███ ███    █▄    ███▐██▄     ███    █▄  ▀███████████          ███ \n" +
                "\t  ███    ███ ███▌    ▄ ███   ▄███   ███    ███ ███   ███       ███    ███     ███    ███ ███    ███   ███ ▀███▄   ███    ███   ███    ███    ▄█    ███ \n" +
                "\t  ██████████ █████▄▄██ ████████▀    ██████████  ▀█   █▀        ███    █▀      ███    █▀  ████████▀    ███   ▀█▀   ██████████   ███    ███  ▄████████▀  \n" +
                "\t             ▀                                                                                        ▀                        ███    ███              " +
                "\n==============================================================================================================================================================" +
                AnsiColors.RESET);
        System.out.println("\n\n\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*********************************\n"+
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*                               *\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*        1. QUICK GAME          *\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*        2. CUSTOM GAME         *\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*        3. CREDITS             *\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*        0. QUIT                *\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*                               *\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*********************************\n");

    }
    public static void selectCharacter(int num){
        System.out.println(
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlayer " + num + ": Choose your character!!\n" +
                        AnsiColors.PURPLE + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. WARRIOR\n" +
                        AnsiColors.CYAN + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. WIZARD\n" +
                        AnsiColors.RESET);
    }

    public static void getReady() throws InterruptedException {
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         READY ?");
        Thread.sleep(1000);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       3");
        Thread.sleep(1000);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       2");
        Thread.sleep(1000);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       1");
        Thread.sleep(800);
        System.out.println();
        Thread.sleep(800);
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      "+ Emoji.CROSSED_SWORDS +" FIGHT! " + Emoji.CROSSED_SWORDS);
        Thread.sleep(800);
    }

    public static void winnerMessage(Character character){
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCongratulations "+ AnsiColors.YELLOW + character.getName() + AnsiColors.RESET + ".  YOU WON!!");
    }

    public static void credits() {
        System.out.println(
                AnsiColors.YELLOW + "\n\n\n" +
                        "\t\t\t**************************************************************************************************************************\n"+
                        "\t\t\t**************************************************************************************************************************\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**         ▓█████  ██▓    ▓█████▄ ▓█████ ███▄    █     ██░ ██  ▄▄▄      ▄████▄   ██ ▄█▀▓█████  ██▀███    ██████         **\n" +
                        "\t\t\t**         ▓█   ▀ ▓██▒    ▒██▀ ██▌▓█   ▀ ██ ▀█   █    ▓██░ ██▒▒████▄   ▒██▀ ▀█   ██▄█▒ ▓█   ▀ ▓██ ▒ ██▒▒██    ▒         **\n" +
                        "\t\t\t**         ▒███   ▒██░    ░██   █▌▒███  ▓██  ▀█ ██▒   ▒██▀▀██░▒██  ▀█▄ ▒▓█    ▄ ▓███▄░ ▒███   ▓██ ░▄█ ▒░ ▓██▄           **\n" +
                        "\t\t\t**         ▒▓█  ▄ ▒██░    ░▓█▄   ▌▒▓█  ▄▓██▒  ▐▌██▒   ░▓█ ░██ ░██▄▄▄▄██▒▓▓▄ ▄██▒▓██ █▄ ▒▓█  ▄ ▒██▀▀█▄    ▒   ██▒        **\n" +
                        "\t\t\t**        ░▒████▒░██████▒░▒████▓ ░▒████▒██░   ▓██░   ░▓█▒░██▓ ▓█   ▓██▒ ▓███▀ ░▒██▒ █▄░▒████▒░██▓ ▒██▒▒██████▒▒         **\n" +
                        "\t\t\t**        ░░ ▒░ ░░ ▒░▓  ░ ▒▒▓  ▒ ░░ ▒░ ░ ▒░   ▒ ▒     ▒ ░░▒░▒ ▒▒   ▓▒█░ ░▒ ▒  ░▒ ▒▒ ▓▒░░ ▒░ ░░ ▒▓ ░▒▓░▒ ▒▓▒ ▒ ░         **\n" +
                        "\t\t\t**         ░ ░  ░░ ░ ▒  ░ ░ ▒  ▒  ░ ░  ░ ░░   ░ ▒░    ▒ ░▒░ ░  ▒   ▒▒ ░ ░  ▒   ░ ░▒ ▒░ ░ ░  ░  ░▒ ░ ▒░░ ░▒  ░ ░         **\n" +
                        "\t\t\t**           ░     ░ ░    ░ ░  ░    ░     ░   ░ ░     ░  ░░ ░  ░   ▒  ░        ░ ░░ ░    ░     ░░   ░ ░  ░  ░           **\n" +
                        "\t\t\t**           ░  ░    ░  ░   ░       ░  ░        ░     ░  ░  ░      ░  ░ ░      ░  ░      ░  ░   ░           ░           **\n" +
                        "\t\t\t**                          ░                                           ░                                               **\n" +
                        "\t\t\t**                                                                                                                      **\n" +
                        "\t\t\t**************************************************************************************************************************\n"+
                        "\t\t\t**************************************************************************************************************************\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                                               THE GAME DEVELOPERS                                                    **\n"+
                        "\t\t\t**                                               ===================                                                    **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                                                      "+AnsiColors.WHITE+"Yisus"+AnsiColors.YELLOW+"                                                           **\n"+
                        "\t\t\t**                                                      "+AnsiColors.WHITE+"Mario"+AnsiColors.YELLOW+"                                                           **\n"+
                        "\t\t\t**                                                      "+AnsiColors.WHITE+"Alex"+AnsiColors.YELLOW+"                                                            **\n"+
                        "\t\t\t**                                                      "+AnsiColors.WHITE+"Fran"+AnsiColors.YELLOW+"                                                            **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                      Special thanks to the IRONHACK's Teachers Team that made this game possible.                    **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**                                           GNU General Public License v3.0                                             **\n"+
                        "\t\t\t**                                                                                                                      **\n"+
                        "\t\t\t**************************************************************************************************************************\n"+
                        "\t\t\t**************************************************************************************************************************\n"+
                        AnsiColors.RESET);


    }

}
