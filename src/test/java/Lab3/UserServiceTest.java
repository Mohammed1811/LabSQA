package Lab3;
import org.example.Lab3.ServiceException;
import org.example.Lab3.UserService;
import org.example.Lab3.Utilisateur;
import org.example.Lab3.UtilisateurApi;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    private UserService userService;

    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com", 1);
        // TODO : Configuration du comportement du mock, utiliser la
        // directive « when » avec sa méthode « thenReturn »

        // doNothing() is the correct method to use since thenReturn()
        // does not accept a void as an argument

        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // TODO : Création du service avec le mock

        userService = new UserService(utilisateurApiMock);

        // TODO : Appel de la méthode à tester

        userService.creerUtilisateur(utilisateur);

        // TODO : Vérification de l'appel à l'API

        verify(utilisateurApiMock).creerUtilisateur(utilisateur);

    }
    @Test
    public void echecDeCreationUtilisateur() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com", 1);
        userService = new UserService(utilisateurApiMock);

        doThrow(new ServiceException("Echéc de la création de l'utilisateur"))
                .when(utilisateurApiMock).creerUtilisateur(utilisateur);

        ServiceException exception = assertThrows(ServiceException.class, () -> {
            userService.creerUtilisateur(utilisateur);
        });

        Assertions.assertEquals("Echéc de la création de l'utilisateur", exception.getMessage());
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
        verifyNoMoreInteractions(utilisateurApiMock);
    }


    // In order to pass this test, we must modify créerUtilisateur to handle
    // any missing argument - TODO later
    @Test
    public void echecValidationCreerUtilisateur() throws ServiceException {
        // Create an invalid user (for example, missing email)
        Utilisateur invalidUser = new Utilisateur("Jean", "Dupont", null, 1);

        // Initialize the service
        userService = new UserService(utilisateurApiMock);

        // Call the method — assuming your service throws an exception on invalid input
        assertThrows(ServiceException.class, () -> {
            userService.creerUtilisateur(invalidUser);
        });

        // Verify that the API was never called due to validation failure
        verify(utilisateurApiMock, never()).creerUtilisateur(any());
    }


}
