package app.friendevents.friendeventsapis.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class GenericControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private GenericController genericController;

    @Mock
    private Logger logger;

    @BeforeTestClass
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(genericController).build();
    }

    /**
     * Test for ping endpoint
     *
     * @throws Exception handling exception for mockMvc.perform()
     */
    @Test
    public void ping() throws Exception {
        mockMvc.perform(get("/api/generic/ping")).andExpect(status().isOk());
    }
}
