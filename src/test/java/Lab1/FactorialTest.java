package Lab1;

import org.example.Lab1.Factorial;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void shouldReturnCorrectResult(){
        assertEquals(Factorial.factorial(6), 720);
    }

    @Test
    void shouldThrowExceptionIfNumberIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

}
