package Lab1;

import org.example.Lab1.Factorial;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void shouldReturnCorrectResult(){
        assertEquals(720, Factorial.factorial(6));
    }

    @Test
    void shouldThrowExceptionIfNumberIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

}
