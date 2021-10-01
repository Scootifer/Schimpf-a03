public class Solution25 {

    //The program will accept user input and loop through each character, making a hasNumber or hasLetter or hasSpecial boolean
    //The program will then match the corresponding length and attributes to find the "score" of the password, 0 for indeterminite, and {1,2,3,4} accoridngly

    int passwordValidator(String password) {

        int len = password.length();

        boolean hasNumbers = false, hasLetters = false, hasSpecial = false;
        char c;

        for (int i = 0; i<len; i++) {
            c = password.charAt(i);

            if( (c > 47) && (c < 58)) {
                hasNumbers = true;
            }

            else if( ( ( (c > 64) && (c < 91) ) ) || ( (c > 96) && (c < 123)) ) {
                hasLetters = true;
            }
            else {
                hasSpecial = true;
            }

        }

        if (len < 8) {
            if(!hasLetters && !hasSpecial) {
                return 1;
            }
            if(!hasNumbers && !hasSpecial) {
                return 2;
            }
        }
        else {
            if(hasSpecial) {
                return 4;
            }
            else {
                return 3;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        final Solution25 obj = new Solution25();

        System.out.println(obj.passwordValidator("abc"));
        System.out.println(obj.passwordValidator("123"));
        System.out.println(obj.passwordValidator("abaaaaaac1"));
        System.out.println(obj.passwordValidator("aaaaaabc1$"));

    }
}
