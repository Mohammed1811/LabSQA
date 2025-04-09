package Lab2.LineCoverageTest;
import org.example.Lab2.Anagram;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    public void shouldThrowExceptionWhenAnArgumentIsNull(){
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "null"));
    }

    @Test
    public void shouldReturnFalseWhenStringLengthIsDifferent(){
        assertFalse(Anagram.isAnagram("dog", "doge"));
    }

    @Test
    public void shouldReturnFalseWhenNotAnagram(){
        assertFalse(Anagram.isAnagram("world", "worst"));
    }

    @Test
    public void shouldReturnTrueWhenAnagram(){
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }
}
