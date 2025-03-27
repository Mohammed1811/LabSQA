import org.example.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void verifyIfEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void verifyTopOfStack(){
        Stack stack = new Stack();
        for(int i = 0; i < 10; i++)
            stack.push(i+1);

        int[] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(stack.peek(), arrayTest[9]);
    }


}
