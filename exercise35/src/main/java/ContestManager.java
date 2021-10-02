/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */


//The ContestManager will have an addPlayer function to add people to the list, and a pickWinner function that will use random to pick from the list.

import java.util.Random;
import java.util.ArrayList;
public class ContestManager {

    private ArrayList<String> list = new ArrayList<>();

    public void addPerson(String name) {
        this.list.add(name);
    }

    public String pickWinner() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

}
