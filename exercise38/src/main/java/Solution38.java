/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// This program will use a filterEvenNumbers that will go piece by piece of the array and check if the value mod 2 = 0
// if it is it will be added to the new array to later be returned
// The list will be created using nextInt() and next() to filter spaces between numbers.

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Solution38 {

    List<Integer> filterEvenNumbers(List<Integer> list) {

        int space = 0; //space in the new array to next occupy

        List<Integer> ret = new ArrayList<>();

        for(int x : list) {
            if(x%2 == 0) {
                ret.add(x);
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in).useDelimiter(" ");
        final Solution38 obj = new Solution38();



        System.out.print("Please enter a list of numbers separated by spaces: ");

        String input = scan.nextLine();
        String[] nums = input.split(" ");

        List<Integer> list = new ArrayList<>();

        for (String num : nums) {
            list.add(Integer.parseInt(num));
        }

        List<Integer> newList = obj.filterEvenNumbers(list);

        System.out.println();
        System.out.println("The list of only even numbers is");
        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }

    }
}
