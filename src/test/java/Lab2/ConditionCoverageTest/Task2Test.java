package Lab2.ConditionCoverageTest;
import org.example.Lab2.Anagram;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    public void shouldThrowExceptionWhenArgument1IsNull(){
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "null"));
    }

    @Test
    public void shouldThrowExceptionWhenArgument2IsNull(){
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("null", null));
    }

    @Test
    public void shouldThrowExceptionWhenAllArgumentsNull(){
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    public void shouldNotThrowExceptionWhenAllArgumentsNotNull(){
        assertDoesNotThrow(() -> Anagram.isAnagram("arg", "args"));
    }

    @Test
    public void shouldReturnFalseWhenStringLengthIsDifferent(){
        assertFalse(Anagram.isAnagram("dog", "doge"));
    }

    @Test
    public void shouldReturnFalseWhenNotAnagram(){
        assertFalse(Anagram.isAnagram("world", "words"));
    }

    @Test
    public void shouldReturnTrueWhenAnagram(){
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    public void shouldReturnTrueWhenStrsEmpty(){
        assertTrue(Anagram.isAnagram("", ""));
    }
}
