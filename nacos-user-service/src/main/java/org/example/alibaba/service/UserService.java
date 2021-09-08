package org.example.alibaba.service;


import org.example.alibaba.entities.User;

public interface UserService {
    User findByUserName(String username);

    boolean insertUser(User user);
}
