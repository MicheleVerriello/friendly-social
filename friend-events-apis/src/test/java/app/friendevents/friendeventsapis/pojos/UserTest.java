package app.friendevents.friendeventsapis.pojos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void userToString() {
        User user = new User(
            "testmail@mail.com",
            "username",
            "hashedPassword",
            1L,
            "name",
            "surname"
        );

        String userString =
            "id: 1\nname: name\nsurname: surname\nemail: testmail@mail.com\nusername: username";

        Assertions.assertEquals(userString, user.toString());
    }
}
