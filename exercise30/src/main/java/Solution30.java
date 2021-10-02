/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

public class Solution30 {

    //The program will use a nested loop to calculate each space of the table and print it using the printTable function

    void printTable() {

        for(int i = 1; i<= 12; i++) {
            for(int z = 1; z<=12; z++) {
                System.out.print(z*i + "\t");
            }
            System.out.print("\n");
        }

    }


    public static void main(String[] args) {

        final Solution30 obj = new Solution30();

        obj.printTable();

    }
}
