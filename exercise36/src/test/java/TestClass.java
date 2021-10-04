import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    void shouldShowSimpleAssertion() {
        Calculator calc = new Calculator();
        calc.addValue(100);
        calc.addValue(200);
        calc.addValue(1000);
        calc.addValue(300);

        Assertions.assertAll(() -> Assertions.assertEquals(400.0, calc.average()),
                () -> Assertions.assertEquals(100, calc.min()),
                () -> Assertions.assertEquals(1000, calc.max()),
                () -> Assertions.assertEquals(353.5533905932738, calc.std()));

    }
}
