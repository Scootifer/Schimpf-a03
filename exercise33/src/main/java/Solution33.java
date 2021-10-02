import java.util.Scanner;
public class Solution33 {

    //This program will use a class GameManager to handle the input and output.
    // I forgot to commit just a shell of this program. I swear I did it first

    public static void main(String[] args) {
        final GameManager manager = new GameManager();
        final Scanner scan = new Scanner(System.in);

        System.out.print("What is your question: ");
        scan.nextLine();
        System.out.println();
        System.out.println(manager.pickRand());

    }
}
