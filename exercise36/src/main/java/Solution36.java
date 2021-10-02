/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// The math and related functions will be handled by the Calculator class
// The solution46 class will use a do while loop to continue until a 'd' is detected in the first spot of input.

import java.util.Scanner;

public class Solution36 {

    public static void main(String[] args) {

        boolean run = true;
        String input;
        char c;

        final Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();



        do
        {
            System.out.print("Please enter a number (enter done to quit): ");
            input = scan.nextLine();

            if (calc.validateInput(input, 'i') == 0) {
                calc.addValue(Integer.parseInt(input));
            }
            else if (input.equalsIgnoreCase("done")){
                run = false;
            }
            else {
                System.out.println("Please enter an integer value");
            }

        }while(run);

        System.out.println();
        System.out.println("The Average of the data is: " + calc.average());
        System.out.println("The Maximum of the data is: " + calc.max());
        System.out.println("The Minimum of the data is: " + calc.min());
        System.out.println("The Standard Deviation of the data is: " + calc.std());


    }
}
