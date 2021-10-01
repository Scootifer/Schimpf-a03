public class Solution29 {

    //The program will use the function validateInput to validate input and calculateTime to perform the math

    // validateInput
    //  Accepts the input and what input type ('i') the input should be.
    //  returns -1 for invalid and 0 for valid
    int validateInput(String input, char type){


        if(type == 'i' ) {
            try{
                Integer.parseInt(input);
            }
            catch(Exception e){
                System.out.println("Please enter an integer value");
                return 0;
            }
        }


        return 1;
    }

    public static void main(String[] args) {


    }
}
