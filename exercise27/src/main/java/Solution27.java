import java.util.Scanner;
public class Solution27 {

    //The program will use a class InputValidator to store the input and various verification functions

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        String fName, lName, zip, id;

        System.out.print("Please enter your first name: ");
        fName = scan.nextLine();

        System.out.print("Please enter your last name: ");
        lName = scan.nextLine();

        System.out.print("Please enter your zip: ");
        zip = scan.nextLine();

        System.out.print("Please enter your id: ");
        id = scan.nextLine();

        final InputValidator v = new InputValidator(fName, lName, zip, id);
        if(v.validateInput() == 0) {
            System.out.println("No errors found.");
        }
    }

}