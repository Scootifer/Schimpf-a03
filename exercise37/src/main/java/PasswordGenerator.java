/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Scott Schimpf
 */

// The PasswordGenerator class will store the possible character sets as final lists
// The class will validate that the password character count constraints are met
//

import java.util.Random;
public class PasswordGenerator {

    final char[] characters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    final char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    final char[] special = {'!','@','#','$','%','^','&','*',';',':','?'};

    int charCount, numCount, specialCount;

    public PasswordGenerator(int len, int s, int n) {
        this.charCount = len - (s+n);
        this.specialCount = s;
        this.numCount = n;
    }

    //will return 0 for valid, or -1 for invalid character count;
    public int validate() {
        if (this.charCount < this.specialCount + this.numCount) {
            return -1;
        }
        else {
            return 0;
        }
    }


    //generatePassword() use a while loop until the password is full. With a switch inside that will generate a random number aka the type
    //if the password typeCount is greater than 0 that char will be added, length will be subtracted, and that typeCount will be subtracted
    public String generatePassword(){
        String password = "";
        int length = this.charCount + this.specialCount + this.numCount;


        final Random rand = new Random();


        while (length > 0) {
            switch(rand.nextInt(3)) {
                case 0:
                    if(this.charCount > 0) {
                        password += this.characters[rand.nextInt(26)];
                        this.charCount--;
                        length--;
                        break;
                    }

                case 1:
                    if(this.numCount > 0) {
                        password += this.numbers[rand.nextInt(10)];
                        this.numCount--;
                        length--;
                        break;
                    }

                case 2:
                    if(this.specialCount > 0) {
                        password += this.special[rand.nextInt(11)];
                        this.specialCount--;
                        length--;
                        break;
                    }
            }
        }


        return password;
    }
}
