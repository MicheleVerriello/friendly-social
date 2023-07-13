package app.friendevents.friendeventsapis.repositories;

import app.friendevents.friendeventsapis.pojos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {}
