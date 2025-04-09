package Lab2.ConditionCoverageTest;
import org.example.Lab2.Palindrome;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    @Test
    public void shouldThrowExceptionWhenStrNull(){
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    public void shouldReturnTrueWhenPalindrome(){
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }
    @Test
    public void shouldReturnFalseWhenNotPalindrome(){
        assertFalse(Palindrome.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void shouldReturnTrueWhenEmptyStr(){
        assertTrue(Palindrome.isPalindrome(""));
    }
}
