/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// This program will use the PasswordGenerator class to handle making the password and storing possible password characters
// The Solution37 class will interact with the PasswordGenerator and prompt the user as need be.
//

import java.util.Scanner;
public class Solution37 {



    public static void main(String[] args ) {
        int length, specialCount, numbers;
        final Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the minimum length: ");
        length = Integer.parseInt(scan.nextLine());

        System.out.print("Please enter the special character count: ");
        specialCount = Integer.parseInt(scan.nextLine());

        System.out.print("Please enter the number count: ");
        numbers = Integer.parseInt(scan.nextLine());

        PasswordGenerator gen = new PasswordGenerator(length, specialCount, numbers);
        if(gen.validate() == 0) {
            System.out.println("Your password is: " + gen.generatePassword());
        }
        else {
            System.out.println("Password must have more characters than numbers and symbols.");
        }


    }
}
