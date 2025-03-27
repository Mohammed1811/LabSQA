import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void verifyFullNameFormat(){
        Person person = new Person("Mohammed","Saoudi",22);
        String fullName = "Mohammed Saoudi";

        assertEquals(fullName, person.getFullName());
    }

    @Test
    void verifyIfAdult(){
        Person person1 = new Person("Mohammed","Saoudi",22);
        Person person2 = new Person("Adam", "Saoudi", 14);

        assertTrue(person1.isAdult());
        assertFalse(person2.isAdult());
    }
}
