package Lab1;

import org.example.Lab1.Stack;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack, emptyStack;
    private final static int[] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @BeforeEach
    void setStack(){
        emptyStack = new Stack();
        stack = new Stack();
        for(int i = 0; i < 10; i++)
            stack.push(i+1);
    }

    @Test
    void shouldReturnTrueWhenEmpty(){
        assertTrue(emptyStack.isEmpty());
    }

    @Test
    void shouldReturnFalseWhenNotEmpty(){
        assertFalse(stack.isEmpty());
    }

    @Test
    void shouldReturnTopOfStack(){
        assertEquals(arrayTest[9], stack.peek());
    }

    @Test
    void throwsExceptionWhenPeekingEmptyStack(){
        assertThrows(IllegalStateException.class, () -> emptyStack.peek());
    }

    @Test
    void throwsExceptionWhenStackEmpty(){
        assertThrows(IllegalStateException.class, () -> emptyStack.pop());
    }

    @Test
    void shouldPushElementToStack(){
        stack.push(11);
        assertEquals(11, stack.peek());
    }
    @Test
    void shouldReturnStackSize(){
        assertEquals(arrayTest.length, stack.size());
    }
}
