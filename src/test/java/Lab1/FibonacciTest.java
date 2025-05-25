package Lab1;

import org.example.Lab1.Fibonacci;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTest {
    @Test
    void shouldReturnCorrectFibonacciTerm(){
        assertEquals(21, Fibonacci.fibonacci(8));
    }

    @Test
    void shouldThrowExceptionIfTermIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}
