public class InputValidator {

    //The validateInput function will run the individual validateFName, validateLName, validateZip, and validateID functions
    //if all functions return 0 then the inputs are valid and the program will prompt the user and terminate

    private String fName;
    private String lName;
    private String zip;
    private String id;

    public InputValidator(String f, String l, String z, String i) {
        this.fName = f;
        this.lName = l;
        this.zip = z;
        this.id = i;
    }

    public int validateInput() {

        int ret = 0;

        if(validateFName() != 0) {
            ret = -1;
        }
        if (validateLName() != 0){
            ret = -1;
        }
        if (validateZip() != 0){
            ret = -1;
        }
        if (validateID() != 0){
            ret = -1;
        }
        return ret;
    }

    //Will ensure that there is input and that it is alphabetic
    private int validateFName() {

        int len = this.fName.length();

        if (len < 2) {
            System.out.println("First Name must be 2 letters or more.");
            return -1;
        }

        for(int i =0; i<len; i++) {
            char c = this.fName.charAt(i);
            if (!((c > 64) && (c < 91))  &&  !((c > 96) && (c < 123))) {
                System.out.println("Please enter letters only.");
                return -1;
            }
        }

        return 0;
    }

    //Will ensure that there is input and that it is alphabetic
    private int validateLName() {

        int len = this.lName.length();

        if (len < 2) {
            System.out.println("Last Name must be 2 letters or more.");
            return -1;
        }

        for(int i =0; i<len; i++) {
            char c = this.lName.charAt(i);
            if (!((c > 64) && (c < 91))  &&  !((c > 96) && (c < 123))) {
                System.out.println("Please enter letters only.");
                return -1;
            }
        }

        return 0;
    }
    //Will ensure that input is a valid length and that it is numerical
    private int validateZip() {

        if(this.zip.length() != 5) {
            System.out.println("Please enter 5 digits");
            return -1;
        }

        for(int i =0; i< 5; i++) {
            char c = this.zip.charAt(i);
            if( !((c > 47) && (c < 58)) ) {
                System.out.println("Please enter numbers for zipcode.");
                return -1;
            }
        }

        return 0;
    }

    //Will ensure that input is the correct format by checking each location
    private int validateID() {
        char c;
        int len = this.id.length();

        if(len != 7) {
            System.out.println("Please enter ID in the format AA-1234.");
            return -1;
        }

        for(int i =0; i< len; i++) {
            c = this.id.charAt(i);

            if (i == 0 || i == 1) {
                if ( !((c > 64) && (c < 91))  &&  !((c > 96) && (c < 123))) {
                    System.out.println("Please enter ID in the format AA-1234.");
                    return -1;
                }
            }
            else if (i == 2) {
                if (c != 45) {
                    System.out.println("Please enter ID in the format AA-1234.");
                    return -1;
                }
            }
            else {
                if (!((c > 47) && (c < 58))) {
                    System.out.println("Please enter ID in the format AA-1234.");
                    return -1;
                }

            }
        }







        return 0;
    }
}
