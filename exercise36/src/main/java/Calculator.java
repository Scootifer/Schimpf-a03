/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// the calculator class will have the functions max, min, average, and std
// values will be added to the local arraylist through the addValue function

import java.util.ArrayList;
public class Calculator {

    private ArrayList<Integer> list = new ArrayList<>();

    //The function add value will add the values to the private arraylist

    public void addValue(int n) {
        list.add(n);
    }

    //Forgot I was only supposed to do psuedocode first... again.
    //This function loops through the

    public double average() {
        double avg = 0.0;

        for(int i : this.list) {
            avg += i;
        }
        return avg/this.list.size();
    }

    // max will set a max variable as the first index of the list and loops through the list reassigning the value to anything larger
    // assumes the list is not empty as it is not specified to arrange for such.
    public int max() {
        return 0;
    }

    // min will set a max variable as the first index of the list and loops through the list reassigning the value to anything smaller
    // assumes the list is not empty as it is not specified to arrange for such.
    public int min() {
        return 0;
    }

    //std will take advantage of the average function to gather the mean of the group. Then iterate the list adding the standard deviation of each num
    //std = Sum(number[s] - average)^2 / len
    public double std() {


        return 0.0;
    }



}
