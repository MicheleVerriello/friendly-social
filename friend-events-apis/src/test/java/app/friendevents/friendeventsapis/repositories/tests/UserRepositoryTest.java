package app.friendevents.friendeventsapis.repositories.tests;

import app.friendevents.friendeventsapis.pojos.User;
import app.friendevents.friendeventsapis.repositories.IUserRepository;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private IUserRepository userRepository;

    @Test
    public void findById() {
        User user = new User(
            "email1@mail.com",
            "username1",
            "pass1",
            null,
            "name1",
            "surname1"
        );

        User userResult = userRepository.save(user);

        Optional<User> userFromDb = userRepository.findById(userResult.getId());

        Assertions.assertTrue(userFromDb.isPresent());
        Assertions.assertNotNull(userFromDb.get());
    }
}
