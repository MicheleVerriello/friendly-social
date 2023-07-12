package app.friendevents.friendeventsapis.repositories;

import app.friendevents.friendeventsapis.pojos.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorizeRepository extends CrudRepository<User, Long> {}
