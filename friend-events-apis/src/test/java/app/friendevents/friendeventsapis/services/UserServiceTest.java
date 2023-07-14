package app.friendevents.friendeventsapis.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

import app.friendevents.friendeventsapis.pojos.User;
import app.friendevents.friendeventsapis.repositories.IUserRepository;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * Test class for the UserService
 */
public class UserServiceTest {
    @Mock
    private IUserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setup() {
        openMocks(this); //this initialize mocks
    }

    @Test
    public void findById() {
        // Mocking the behavior of the repository
        Long id = 1L;
        User user = new User(
            "testmail@mail.com",
            "username",
            "hashedPassword",
            id,
            "name",
            "surname"
        );
        when(userRepository.findById(id)).thenReturn(Optional.of(user));

        // Calling the service method
        Optional<User> result = userService.getUserById(id);

        // Verifying the result
        assertEquals(result, Optional.of(user));
    }

    @Test
    public void findById_ReturnNull() {
        // Mocking the behavior of the repository
        Long id = 1L;
        when(userRepository.findById(id)).thenReturn(Optional.empty());

        // Calling the service method
        Optional<User> result = userService.getUserById(id);

        // Verifying the result
        assertEquals(result, Optional.empty());
    }

    @Test
    public void createUser() {
        // Mocking the behavior of the repository
        User user = new User(
            "testmail@mail.com",
            "username",
            "hashedPassword",
            1L,
            "name",
            "surname"
        );
        when(userRepository.save(user)).thenReturn(user);

        // Calling the service method
        User result = userService.createUser(user);

        // Verifying the result
        assertEquals(result, user);
    }

    @Test
    public void createUser_ReturnNull() {
        // Mocking the behavior of the repository
        User user = new User(
            "testmail@mail.com",
            "username",
            "hashedPassword",
            1L,
            "name",
            "surname"
        );
        when(userRepository.save(user)).thenReturn(null);

        // Calling the service method
        User result = userService.createUser(user);

        // Verifying the result
        assertNull(result);
    }
}
