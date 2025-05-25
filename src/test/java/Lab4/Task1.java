package Lab4;

import org.example.Lab4.Task1.User;
import org.example.Lab4.Task1.UserRepository;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Task1 {
    @Mock
    private UserRepository mockedUserRepository;

    @Test
    public void shouldReturnCorrectUser(){
        User user = new User(1811, "Mohammed Saoudi");
        when(mockedUserRepository.findUserById(1811)).thenReturn(user);

        User mockedUser = mockedUserRepository.findUserById(1811);

        assertEquals(user, mockedUser);
    }
}
