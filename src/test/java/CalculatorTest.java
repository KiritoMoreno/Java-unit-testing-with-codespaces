import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    int expected = 3;

    int actual = calculator.sum(1, 2);

    assertEquals(expected, actual);
  }

  @Test
  public void testSubtract() {
    int expected = 0;

    int actual = calculator.subtract(3, 3);

    assertEquals(expected, actual);
  }

  @Test
  public void testMultiply() {
    int expected = 10;
    int actual = calculator.multiply(2, 5);
    assertEquals(expected, actual);
  }

  @Test
  public void testDivide() {
    int expected = 9;
    int actual = calculator.divide(27, 3);
    assertEquals(expected, actual);
  }

}
