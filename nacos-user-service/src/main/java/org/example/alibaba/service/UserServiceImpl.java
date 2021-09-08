package org.example.alibaba.service;

import org.example.alibaba.entities.User;
import org.example.alibaba.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User findByUserName(String username) {
        //测试熔断
        if(username.equals("123"))
            throw new RuntimeException("123");
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean insertUser(User user) {
        //测试熔断
        if(user.getUsername().equals("123"))
            throw new RuntimeException("123");
        return userRepository.insert(user);
    }
}
