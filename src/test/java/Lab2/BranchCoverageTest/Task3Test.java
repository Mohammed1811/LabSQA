package Lab2.BranchCoverageTest;
import org.example.Lab2.BinarySearch;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    public static final int[] ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void shouldThrowExceptionWhenArrayIsNull(){
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 0));
    }

    @Test
    public void shouldReturnElementFromLowerMiddle(){
        int index = BinarySearch.binarySearch(ARRAY, 1);
        assertEquals(1, ARRAY[index]);
    }

    @Test
    public void shouldReturnElementFromUpperMiddle(){
        int index = BinarySearch.binarySearch(ARRAY, 10);
        assertEquals(10, ARRAY[index]);
    }

    @Test
    public void shouldReturnMinusOneWhenElementNotInArray(){
        assertEquals(-1, BinarySearch.binarySearch(ARRAY, 11));
    }
}
