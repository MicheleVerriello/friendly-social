package app.friendevents.friendeventsapis.pojos;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String email;
    String username;
    String password;
    String name;
    String surname;

    public User(
        String email,
        String username,
        String password,
        Long id,
        String name,
        String surname
    ) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return (
            "id: " +
            (this.getId() != null ? this.getId() : "null") +
            "\n" +
            "name: " +
            (this.getName() != null ? this.getName() : "null") +
            "\n" +
            "surname: " +
            (this.getSurname() != null ? this.getSurname() : "null") +
            "\n" +
            "email: " +
            (this.getEmail() != null ? this.getEmail() : "null") +
            "\n" +
            "username: " +
            (this.getUsername() != null ? this.getUsername() : "null")
        );
    }
}
