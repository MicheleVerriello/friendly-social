package app.friendevents.friendeventsapis.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generic")
public class GenericController {

    private static final Logger logger = LoggerFactory.getLogger(GenericController.class);


    /**
     * Simple endpoint to ping the app and see if it's running.
     * @return The app status
     */
    @GetMapping("/ping")
    public String ping() {
        logger.info("Reached ping endpoint");
        return "App Live On AWS EC2, Hello!";
    }
}
