/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
*/

import java.util.Scanner;

public class Solution29 {

    //The program will use the function validateInput to validate input and calculateTime to perform the math

    // validateInput
    //  Accepts the input and what input type ('i') the input should be.
    //  returns -1 for invalid and 0 for valid
    int validateInput(String input, char type){

        int i;

        if(type == 'i' ) {
            try{
                i = Integer.parseInt(input);
            }
            catch(Exception e){
                System.out.println("Sorry that's not valid.");
                return -1;
            }
            if(i == 0) {
                System.out.println("Sorry you can't enter 0.");
                return -1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        final Solution29 obj = new Solution29();
        final Scanner scan = new Scanner(System.in);
        boolean runLoop = true;
        String input;

        do {
            System.out.print("Please enter the rate of return: ");
            input = scan.nextLine();
            if (obj.validateInput(input, 'i') == 0) {
                runLoop = false;
            }
        }while(runLoop);

        System.out.println("It will take " + 72/Integer.parseInt(input) + " years to double your initial investment.");



    }
}
