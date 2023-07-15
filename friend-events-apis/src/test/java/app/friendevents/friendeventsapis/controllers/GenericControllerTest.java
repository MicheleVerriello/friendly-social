package app.friendevents.friendeventsapis.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class GenericControllerTest {
    @Autowired
    private MockMvc mockMvc;

    /**
     * Test for ping endpoint
     *
     * @throws Exception handling exception for mockMvc.perform()
     */
    @Test
    public void ping() throws Exception {
        mockMvc.perform(get("/generic/ping")).andExpect(status().isOk());
    }
}
