package Lab2.BranchCoverageTest;
import org.example.Lab2.QuadraticEquation;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {
    @Test
    public void shouldThrowExceptionWhenAIsZero(){
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 2));
    }

    @Test
    public void shouldNotThrowExceptionWhenAIsNotZero(){
        assertDoesNotThrow(() -> QuadraticEquation.solve(1, 2, 3));
    }

    @Test
    public void shouldReturnNullWhenDeltaIsNegative(){
        assertNull(QuadraticEquation.solve(1, 1, 1));
    }

    @Test
    public void shouldReturnAResultWhenDeltaIsNotNegative(){
        assertNotNull(QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    public void shouldReturnDoubleSolutionWhenDeltaIsZero(){
        assertArrayEquals(new double[]{1}, QuadraticEquation.solve(1, -2, 1));
    }

    @Test
    public void shouldReturnCorrectSolution(){
        assertArrayEquals(new double[]{2, 1}, QuadraticEquation.solve(1, -3, 2));
    }
}
