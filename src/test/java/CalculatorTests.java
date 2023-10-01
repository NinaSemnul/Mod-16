import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTests {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

   @Test
   public void testThatSumWorksCorrect1() {
       int actual = calc.sum(1);
       int expected = 1;
       Assertions.assertEquals(expected, actual);
   }

    @Test
    public void testThatSubWorksCorrect3() {
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSubWorksCorrect0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }

}
