package Lab2.LineCoverageTest;
import org.example.Lab2.FizzBuzz;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class Task6Test {
    @Test
    public void shouldThrowExceptionWhenIntegerIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void shouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void shouldReturnFizz(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void shouldReturnBuzz(){
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void shouldReturnStringOfNumber(){
        assertEquals("17", FizzBuzz.fizzBuzz(17));
    }
}
