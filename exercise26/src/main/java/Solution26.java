import java.util.Scanner;

public class Solution26 {

    // The program will accept the users input of  the, number of months, daily rate, balance, and monthly payment in the constructor
    // Then it will update the values of and use the class PaymentCalculator calling calculateMonthsUntilPaidOff to get the months remaining
    //

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        double balance, dRate, monthlyPayment;
        int numMonths;


        System.out.print("Please enter the balance: ");
        balance = Double.parseDouble(scan.nextLine());

        System.out.print("Please enter the APR: ");
        dRate = Double.parseDouble(scan.nextLine());

        System.out.print("Please enter the monthly payments: ");
        monthlyPayment = Double.parseDouble(scan.nextLine());

        final PaymentCalculator calc = new PaymentCalculator(dRate, balance, monthlyPayment);

        numMonths = calc.calculateMonthsUntilPaidOff();

        System.out.println("It will take " + numMonths + " months to pay the card off.");



    }
}
