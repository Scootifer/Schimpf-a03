/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// the calculator class will have the functions max, min, average, and std
// values will be added to the local arraylist through the addValue function
// input will be validated with validate input

import java.lang.Math;
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
        int max = this.list.get(0);

        for(int i: this.list) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    // min will set a max variable as the first index of the list and loops through the list reassigning the value to anything smaller
    // assumes the list is not empty as it is not specified to arrange for such.
    public int min() {

        int min = this.list.get(0);

        for(int i: this.list) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    //std will take advantage of the average function to gather the mean of the group. Then iterate the list adding the standard deviation of each num
    //std = sqrt(Sum(number[s] - average)^2 / len)
    public double std() {
        double sd = 0.0;
        double average = this.average();

        for (int i : this.list) {
            sd += Math.pow(i - average, 2);
        }
        return Math.sqrt(sd / this.list.size() );
    }

    // validateInput
    //  Accepts the input and what input type ('i', 'd') the input should be.
    //  returns 0 for invalid and 1 for valid

    public int validateInput(String input, char type){

        if(type == 'i' ) {
            try{
                Integer.parseInt(input);
            }
            catch(Exception e){
                return -1;
            }
        }

        return 0;
    }


}
