import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Test Math Operations in Calculator class")
public class CalculatorTest {

    // pattern AAA

    // Arrange

    // Act

    // Assert



    // naming tests
    // test<System Under Test>_< Condition or State Change>_

    @DisplayName("Test 4/2 = 2")
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        // Arrange
        // in this arrange section you initialise all the needed variables and objects needed for the test
        Calculator calculator = new Calculator();
        int dividend = 4;
        int divisor = 2;
        int expectedResult = 2;

        // Act
        // in act section this is where you will invoke the method and test
        int actualResult = calculator.integerDivision(dividend,divisor);

        // Assert
        // in assert section you will validate the test results
        assertEquals(expectedResult, actualResult, "4/2 did not produce 2");

    }

    @DisplayName("Division by Zero")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        fail("Not implemented yet");
    }
    @Test
    void integerSubtraction () {
        Calculator calculator = new Calculator();
        int minuend = 33;
        int subtrahend = 1;
        int expectedResult = 32;
        int actualResult = calculator.integerSubtraction(minuend,subtrahend);
        assertEquals(expectedResult, actualResult, () -> minuend + " " + subtrahend + " did not produce : " + expectedResult);
    }
}
