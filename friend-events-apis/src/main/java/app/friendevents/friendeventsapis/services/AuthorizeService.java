package app.friendevents.friendeventsapis.services;

import app.friendevents.friendeventsapis.repositories.IAuthorizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizeService {

    @Autowired
    IAuthorizeRepository authorizeRepository;
}
