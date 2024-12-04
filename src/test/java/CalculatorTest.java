import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

  // Check the Boolean value
  @Test
  public void testIsEven() {
    boolean expected = true;

    boolean actual = calculator.isEven(2);

    assertEquals(expected, actual);

  }

  // Simplify this now using assertTrue
  @Test
  public void testIsEvenTrue() {
    boolean actual = calculator.isEven(2);
    assertTrue(actual);
  }

  // Check that odd numbers return false
  @Test
  public void testIsOdd() {
    boolean actual = calculator.isEven(1);
    assertFalse(actual);
  }

  // Comparing Arrays 
  @Test
  public void testIncrementArray(){
    int[] expected = new int[]{2,3,4};

    int [] actual = calculator.incrementArray(new int[]{1,2,3});

    assertArrayEquals(expected, actual);

  }

  // This assert throws methods actually returns an exception.
  @Test
  public void testDivideByZero(){
    // Need to pass to things:
    // First thing is going to be the exception that it's expecting to be thrown,(illegal argument exception) make clear that the error has been caused by the inputs.
    // Second thing is lambda expression that call the code and it's expecting to throw the exception.
    assertThrows(IllegalArgumentException.class, ()-> calculator.divide(1,0));
  }

  // Exception to return a message ERROR say what the problem is.
  @Test
  public void testDivideByZeroWithTheMessage() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
  
    String expected = "Ints cannot be divided by zero";

    String actual = exception.getMessage();

    assertEquals(expected, actual);
  
  }

}
