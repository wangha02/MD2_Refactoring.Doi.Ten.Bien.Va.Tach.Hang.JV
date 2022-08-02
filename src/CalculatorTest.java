import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    public static final char ADDITION = "+";

    @Test
    @DisplayName("Testing additior")
    void testCalculateAdd(){
        int a = 2;
        int b = 1;
        String o = "+";
        int expected = 2;

        int result = Calculator.caculate(a, b, o);
        assertEquals(expected, result);
    }

    @DisplayName("Testing subtraction")
    void testCalculateSub(){
        int a = 2;
        int b = 1;
        String o = "-";
        int expected = 1;

        int result = Calculator.caculate(a, b, o);
        assertEquals(expected, result);
    }
}
