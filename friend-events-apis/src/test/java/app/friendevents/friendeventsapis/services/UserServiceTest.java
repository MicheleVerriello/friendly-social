package app.friendevents.friendeventsapis.services;

import app.friendevents.friendeventsapis.pojos.User;
import app.friendevents.friendeventsapis.repositories.IUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private IUserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); //this initialize mocks
    }

    @Test
    public void testFindById() {
        // Mocking the behavior of the repository
        Long id = 1L;
        User user = new User("testmail@mail.com", "username", "hashedPassword", 1L);
        when(userRepository.findById(id)).thenReturn(Optional.of(user));

        // Calling the service method
        Optional<User> result = userService.getUserById(id);

        // Verifying the result
        assertEquals(result, Optional.of(user));
    }
}
