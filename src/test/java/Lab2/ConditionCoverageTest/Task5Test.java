package Lab2.ConditionCoverageTest;
import org.example.Lab2.RomanNumeral;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {
    @Test
    public void shouldThrowExceptionWhenIntegerIsMoreThan3999(){
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    public void shouldThrowExceptionWhenIntegerIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    public void shouldNotThrowExceptionWhenIntegerIsInBound(){
        assertDoesNotThrow(() -> RomanNumeral.toRoman(1234));
    }

    @Test
    public void shouldReturnResult(){
        assertEquals("IX", RomanNumeral.toRoman(9));
    }
}
