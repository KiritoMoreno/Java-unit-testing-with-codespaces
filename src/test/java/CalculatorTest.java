import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    int expected = 3; // Corregido de 'inte' a 'int'

    int actual = calculator.sum(1, 2);

    assertEquals(expected, actual);
  }
}
