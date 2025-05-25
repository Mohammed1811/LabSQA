package Lab2.BranchCoverageTest;
import org.example.Lab2.RomanNumeral;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {
    @Test
    public void shouldThrowExceptionWhenIntegerNotInBound(){
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    public void shouldNotThrowExceptionWhenIntegerInBound(){
        assertDoesNotThrow(() -> RomanNumeral.toRoman(1234));
    }

    @Test
    public void shouldReturnResult(){
        assertEquals("IX", RomanNumeral.toRoman(9));
    }
}
