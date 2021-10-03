import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    void shouldShowSimpleAssertion() {
        PaymentCalculator calc = new PaymentCalculator(12, 5000, 100);
        Assertions.assertEquals(70, calc.calculateMonthsUntilPaidOff());
    }
}
