package app.friendevents.friendeventsapis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generic")
public class GenericController {

    /**
     * Simple endpoint to ping the app and see if it's running.
     * @return The app status
     */
    @GetMapping("/ping")
    public String ping() {
        return "App Live On AWS Demo, Hello!";
    }
}
