package app.friendevents.friendeventsapis.pojos;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseTable {

    String email;
    String username;
    String password;

    public User(String email, String username, String password, Long id) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
