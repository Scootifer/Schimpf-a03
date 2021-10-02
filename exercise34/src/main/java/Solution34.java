/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;
//This program will use a class EmployeeHandler to handle the arraylist and related functions

public class Solution34 {

    public static void main(String[] args) {
        final EmployeeManager manager = new EmployeeManager();
        final Scanner scan = new Scanner(System.in);

        manager.printList();

        System.out.print("Please enter an employee to remove: ");
        String person = scan.nextLine();

        manager.removeEmployee(person);
        manager.printList();
    }




}
