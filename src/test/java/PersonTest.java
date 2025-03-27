import org.example.Person;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person, person2;

    @BeforeEach
    void setPerson(){
        person = new Person("Mohammed","Saoudi",22);
        person2 = new Person("Adam", "Saoudi", 15);
    }

    @Test
    void shouldReturnFullNameFormat(){
        String fullName = "Mohammed Saoudi";
        assertEquals(fullName, person.getFullName());
    }

    @Test
    void shouldReturnTrueIfAdult(){
        assertTrue(person.isAdult());
    }

    @Test
    void shouldReturnFalseIfNotAdult(){
        assertFalse(person2.isAdult());
    }
}
