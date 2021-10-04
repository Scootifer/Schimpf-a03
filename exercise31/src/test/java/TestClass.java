import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    void shouldShowSimpleAssertion() {
        HeartRateManager calc = new HeartRateManager(65, 22);
        Assertions.assertEquals(138, (int)calc.calculateTargetHR(55));
    }
}
