package org.example.producter.repositories;

import org.example.producter.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userRepository;

    UserRepository() {
        userRepository = new ArrayList<>();
    }

    public boolean insert(User user) {
        return userRepository.add(user);
    }

    public User findByUsername(String username) {
        if (userRepository == null || userRepository.size() == 0)
            return null;
        for (User user : userRepository) {
            if (username.equals(user.getUsername()))
                return user;
        }
        return null;
    }
}
