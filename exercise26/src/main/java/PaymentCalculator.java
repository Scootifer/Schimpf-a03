import java.lang.Math;
public class PaymentCalculator {

    // The PaymentCalculator will have a set its values through the constructor and then use a public calculateMonthsUntilPaidOff method
    // calculateMonthsUntilPaidOff will use the class' variables to return an integer number of months until paid off.

    double dRate;
    double balance;
    double monthlyPayment;

    public PaymentCalculator(double i, double b, double m) {

        this.dRate = (i/100)/365;
        this.balance = b;
        this.monthlyPayment = m;
    }

    public double calculateMonthsUntilPaidOff() {


        return Math.ceil(-(1/30) * Math.log(1 + (this.balance/this.monthlyPayment) * (1 - Math.pow((1+this.dRate), 30))) / Math.log(1 + this.dRate));
    }

}
