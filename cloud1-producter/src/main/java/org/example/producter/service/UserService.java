package org.example.producter.service;

import org.example.producter.entities.User;

public interface UserService {
    User findByUserName(String username);

    boolean insertUser(User user);
}
