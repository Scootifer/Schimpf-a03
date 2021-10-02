/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;

class Solution32 {

     // validateInput
     //  Accepts the input and what input type ('i') the input should be.
     //  returns -1 for invalid and 0 for valid
     int validateInput(String input, char type){



          if(type == 'i' ) {
               try{
                    Integer.parseInt(input);
               }
               catch(Exception e){
                    System.out.println("Please enter an integer.");
                    return -1;
               }

          }

          return 0;
     }

    //The program will use a GameManager class to handle the game data storage and functionality
    // This program will use a do while loop to determine if the game will be played again

     public static void main(String[] args) {

          final Scanner scan = new Scanner(System.in);

          final Solution32 obj = new Solution32();

          String input;
          int difficulty;
          int guess;

          do {
               System.out.print("Please enter the difficulty: ");
               input = scan.nextLine();
               if(obj.validateInput(input, 'i') == 0) {
                    difficulty = Integer.parseInt(input);
               }
               else {
                    difficulty = 0;
               }

          }while(difficulty == 0);

          final GameManager manager = new GameManager(difficulty);
          int guessCount =0;

          do {
               System.out.print("Please enter your guess: ");
               input = scan.nextLine();
               if (obj.validateInput(input, 'i') == 0) {
                    guess = Integer.parseInt(input);
               }
               else {
                    guess = -1; //essentially skips this turn
               }
               guessCount++;

          }while(manager.guess(guess) != 1);

          System.out.println("You finished in " + guessCount + " guesses.");

     }

}
