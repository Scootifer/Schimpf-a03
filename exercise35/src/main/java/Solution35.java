/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// This program will use a ContestManager class that will handle the game
// the Solution35 class will have a do while loop continuing until input is empty

import java.util.Scanner;
public class Solution35 {



    public static void main(String[] args) {
        boolean run = true;
        String input;

        final Scanner scan = new Scanner(System.in);
        ContestManager manager = new ContestManager();



        do
        {
            System.out.print("Please enter a user (enter a space to quit): ");
            input = scan.nextLine();
            if(!input.equals(" ") && input.length() > 0) {
                manager.addPerson(input);
            }
            else {
                run = false;
            }

        }while(run);
        System.out.println();
        System.out.println("The winner is " + manager.pickWinner());
    }

}
