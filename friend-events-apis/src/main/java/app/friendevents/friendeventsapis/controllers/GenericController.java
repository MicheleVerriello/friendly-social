package app.friendevents.friendeventsapis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generic")
public class GenericController {

    @GetMapping("/ping")
    public String ping() {
        return "App Live";
    }
}
