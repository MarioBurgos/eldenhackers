package com.eldenhackers.utilities;

import java.util.Scanner;

public class CustomScanner {
    private Scanner scanner = new Scanner(System.in);
    public String scanString (){
        String string = scanner.nextLine();
        return string;
    }

    public int scanInt (){
        String integer;
        do {
            integer = scanner.nextLine();
            if(!integer.chars().allMatch(Character::isDigit) || integer.isEmpty() || integer.isBlank()){
                System.out.println("Invalid input try a valid option");
            }
        }while (!integer.chars().allMatch(Character::isDigit) || integer.isEmpty() || integer.isBlank());
        //cI.close();
        return Integer.valueOf(integer);
    }

    public void closeScanner (){
        scanner.close();
    }
}
