package app.friendevents.friendeventsapis.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import app.friendevents.friendeventsapis.pojos.User;
import app.friendevents.friendeventsapis.services.UserService;
import jakarta.annotation.security.RunAs;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void getUserById() throws Exception {
        User user = new User(
            "email1@mail.com",
            "username1",
            "pass1",
            1L,
            "name1",
            "surname1"
        );

        Mockito.when(userService.getUserById(1L)).thenReturn(Optional.of(user));

        mockMvc.perform(get("/users/1")).andExpect(status().isOk());

        Mockito.verify(userService, Mockito.times(1)).getUserById(1L);
    }

    @Test
    public void createUser() {}
}
