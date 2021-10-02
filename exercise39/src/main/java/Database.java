
// The program will then use the native sorting of a TreeMap to sort the (lName, fname) map by LastName and from their use the lastName key to get the
// corresponding values in the other maps.
// (key:value) 1: (LastName, FirstName) 2:(LastName, Position) 3(LastName, separationDate)
// The program will have a sort function that will sort and print data.


import java.util.*;
public class Database {
    private Map<String, String> fName = new HashMap<>();
    private Map<String, String> position = new HashMap<>();
    private Map<String, String> separationDate = new HashMap<>();

    public Database() {
        this.fName.put("Jackson", "Jacquelyn");
        this.fName.put("Johnson", "John");
        this.fName.put("Xiong", "Tou");
        this.fName.put("Michaelson", "Michaela");
        this.fName.put("Jacobson", "Jake");
        this.fName.put("Webber", "Sally");

        this.separationDate.put("Jackson", " ");
        this.separationDate.put("Johnson", "2016-12-31");
        this.separationDate.put("Xiong", "2016-10-05");
        this.separationDate.put("Michaelson", "2015-12-19");
        this.separationDate.put("Jacobson", " ");
        this.separationDate.put("Webber", "2015-12-18");

        this.position.put("Jackson", "DBA");
        this.position.put("Johnson", "Manager");
        this.position.put("Xiong", "Software Engineer");
        this.position.put("Michaelson", "District Manager");
        this.position.put("Jacobson", "Programmer");
        this.position.put("Webber", "Web Developer");
    }

    public void sort() {
        TreeMap<String, String> sortedList = new TreeMap<>();
        sortedList.putAll(this.fName);

        System.out.println("Full Name\t\t\t | Position \t\t | Separation Date");


        for(Map.Entry<String, String> e : sortedList.entrySet()) {
            System.out.format("%-10s %-9s | %-17s | %-16s\n", e.getKey(), e.getValue(), this.position.get(e.getKey()), this.separationDate.get(e.getKey()));
        }
    }
}
