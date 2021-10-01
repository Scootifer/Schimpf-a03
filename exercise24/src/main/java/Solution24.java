import java.util.Scanner;

public class Solution24 {
    //The program will loop through the given word letter by letter using the String.contains() function
    //If any letter is not contained the function will return false


    final Scanner scan = new Scanner(System.in);

    String getInput(int requestCount) {
        if (requestCount == 1) {
            System.out.print("Please enter a word: ");
        }
        else {
            System.out.print("Please enter the next word: ");
        }

        return scan.nextLine();
    }

    boolean isAnagram(String word1, String word2) {
        boolean ret;
        int length = word1.length();
        char[] charSet = word2.toCharArray();

        if (length != word2.length()) {
            return false;
        }

        for (int i = 0; i<length; i++) {
            if (!word1.contains( Character.toString(word2.charAt(i)) ) ){
                return false;
            }

        }
        ret = true;

        return ret;
    }


    public static void main(String[] args) {
        final Solution24 obj = new Solution24();
        String word1 = obj.getInput(1);
        String word2 = obj.getInput(2);

        String output = obj.isAnagram(word1, word2) ? "The words are anagrams" : "The words are not anagrams";

        System.out.println(output);
    }
}