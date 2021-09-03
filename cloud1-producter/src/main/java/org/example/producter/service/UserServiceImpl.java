package org.example.producter.service;

import org.example.producter.entities.User;
import org.example.producter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean insertUser(User user) {
        return userRepository.insert(user);
    }
}
