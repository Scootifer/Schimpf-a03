/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// This class will use an arraylist to handle the employees, using the .remove() function to remove employees

import java.util.ArrayList;
public class EmployeeManager {

    private ArrayList<String> employees = new ArrayList<>();

    public EmployeeManager() {
        employees.add("Jake Fram");
        employees.add("Todd Jake");
        employees.add("Alice Paul");
        employees.add("Jan Uary");
        employees.add("Kelvin Temp");
    }

    public void removeEmployee(String name) {
        this.employees.remove(name);
    }

    public void printList() {
        System.out.println();

        for(String p : this.employees) {
            System.out.println(p);
        }

        System.out.println();
    }
}
