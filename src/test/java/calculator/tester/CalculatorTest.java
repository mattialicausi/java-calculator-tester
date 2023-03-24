package calculator.tester;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(8.0, Calculator.add(4.0f, 4.0f) );
    }

    @Test
    void subtract() {
        assertEquals(0.0, Calculator.subtract(4.0f, 4.0f) );
    }

    @Test
    void divide() {
        assertEquals(3.0, Calculator.divide(6.0f, 2.0f) );
    }

    @Test
    void multiply() {
        assertEquals(64.0, Calculator.multiply(8.0f, 8.0f) );
    }
}