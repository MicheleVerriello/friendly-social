package app.friendevents.friendeventsapis.services;

import app.friendevents.friendeventsapis.pojos.User;
import app.friendevents.friendeventsapis.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        // Additional logic/validation can be performed here
        return userRepository.save(user);
    }
}
