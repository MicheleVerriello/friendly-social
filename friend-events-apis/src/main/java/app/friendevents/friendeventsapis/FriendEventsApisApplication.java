package app.friendevents.friendeventsapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FriendEventsApisApplication {

    /**
     * entry point of the spring boot applications
     * @param args are the initial input
     */
    public static void main(String[] args) {
        SpringApplication.run(FriendEventsApisApplication.class, args);
    }
}
