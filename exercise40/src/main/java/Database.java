
//This program is built using the frame of Solution 39. The data is stored in 3 maps where the last name is the key to each.
//The function will use findRecord() to loop through the name hashmap, and if the first or last name contain the selection they will be printed.


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

}
