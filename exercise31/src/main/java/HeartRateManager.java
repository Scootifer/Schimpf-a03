/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */
import java.lang.Math;
public class HeartRateManager {

    //This class will store the resting pulse and age of the user and set them in the constructor
    // The class will have a printTableHead() function which will do such, and then a printTableData() function to fill the rest of the table
    //Using the calculateTargetHR function;

    int resting, age;

    public HeartRateManager(int r, int a) {
        this.resting = r;
        this.age = a;
    }

    void printTableHead() {
        System.out.println();
        System.out.println("Resting Pulse: " + this.resting + " \t Age: " + this.age);
        System.out.println();
        System.out.println("Intensity| Rate");
        System.out.println("---------|------");
    }

    void printTable() {
        for(int i = 55; i<100; i+=5) {
            System.out.println(i + "% \t | " + (int)this.calculateTargetHR(i) + " bpm");
        }
    }


    //between using Math.ceil and not I had inconsistent results as the example and such do not know which to use
    //Not using it has the most consistent results. It is not specified in the question
    double calculateTargetHR(int percent) {

        return (((220-this.age) - this.resting) * ((double)percent/100) + this.resting);
    }
}
