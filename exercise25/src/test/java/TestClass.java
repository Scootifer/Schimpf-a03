import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    void shouldShowSimpleAssertion() {
        Solution25 calc = new Solution25();
        Assertions.assertAll(() -> Assertions.assertEquals(2, calc.passwordValidator("abc")),
                () -> Assertions.assertEquals(1, calc.passwordValidator("123")),
                () -> Assertions.assertEquals(3, calc.passwordValidator("abaaaaaac1")),
                () -> Assertions.assertEquals(4, calc.passwordValidator("abaaaaaac1$")));

    }
}
