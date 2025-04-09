package Lab1;

import org.example.Lab1.Prime;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @Test
    void shouldReturnTrueIfPrime(){
        assertTrue(Prime.isPrime(104729));
    }

    @Test
    void shouldReturnFalseIfNotPrime(){
        assertFalse(Prime.isPrime(33));
    }

    @Test
    void shouldReturnFalseIfNegativeNumber(){
        assertFalse(Prime.isPrime(-5));
    }
}
