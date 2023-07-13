package app.friendevents.friendeventsapis.repositories.seed;

import app.friendevents.friendeventsapis.pojos.User;
import app.friendevents.friendeventsapis.repositories.IUserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
public class RepositoriesTestSeedConfiguration {
    private final IUserRepository userRepository;

    public RepositoriesTestSeedConfiguration(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void seedData() {
        User user1 = new User(
            "email1@mail.com",
            "username1",
            "pass1",
            null,
            "name1",
            "surname1"
        );

        User user2 = new User(
            "email2@mail.com",
            "username2",
            "pass2",
            null,
            "name2",
            "surname2"
        );

        userRepository.save(user1);
        userRepository.save(user2);
    }
}
