/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;
public class Solution31 {

    //The program will use the HeartRateManager class to handle print statements and calculations

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        int resting, age;

        //input is handled this way to continously move the scanner to the next line
        System.out.print("Please enter your resting heart rate: " );
        resting = Integer.parseInt(scan.nextLine());

        System.out.print("Please enter your age: " );
        age = Integer.parseInt(scan.nextLine());

        final HeartRateManager manager = new HeartRateManager(resting, age);
        manager.printTableHead();
        manager.printTable();
    }

}
