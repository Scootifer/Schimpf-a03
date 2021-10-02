/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Random;
public class GameManager {

    // The class will use the constructor to set the secret number
    // The guess function will accept a guess and compare it to the secret number
    // -it will determine and print output accordingly

    private int secretNumber;

    public GameManager(int d) {
        Random rand = new Random();

        if(d == 1) {
            this.secretNumber = 1 + rand.nextInt(10);
        }
        else if(d == 2) {
            this.secretNumber = 1 + rand.nextInt(100);
        }
        else {
            this.secretNumber = 1 + rand.nextInt(1000);
        }
    }




    public int guess(int guess) {

        if(guess == this.secretNumber) {
            return 1;
        }
        else if (guess > this.secretNumber) {
            System.out.println("Your guess is too high");
        }
        else if (guess < 0) {
            System.out.println("Negative numbers and Characters are not valid.");
        }
        else {
            System.out.println("Your guess is too low.");
        }

        return 0;
    }
}
