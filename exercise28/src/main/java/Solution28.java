import java.util.Scanner;

public class Solution28 {
    //  The program will have a getInput function that will return the inputted integer
    //  The getAddition function will loop calling the getInput function 5 times, adding the returned value and returning the final total variable

    final Scanner scan = new Scanner(System.in);

    int getInput(){
        System.out.print("Please enter an integer: ");
        return Integer.parseInt(scan.nextLine());

    }

    int getAddition() {
        int total = 0;

        for(int i =0; i<5; i++) {
            total += getInput();
        }

        return total;
    }

    public static void main(String[] args) {

        final Solution28 obj = new Solution28();

        int total = obj.getAddition();
        System.out.println("The total is " + total);
    }
}
