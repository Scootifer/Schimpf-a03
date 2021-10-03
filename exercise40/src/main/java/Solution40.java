/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// The program Solution40 will use the Database class to employ  hash maps
// (key:value) 1: (LastName, FirstName) 2:(LastName, Position) 3(LastName, separationDate)
//


import java.util.Scanner;
public class Solution40 {

    public static void main(String[] args) {
        final Database d = new Database();
        final Scanner scan = new Scanner(System.in);
        String input;

        System.out.print("Please enter your string: ");
        input = scan.next();
        System.out.println();
        d.findRecord(input);



    }
}
