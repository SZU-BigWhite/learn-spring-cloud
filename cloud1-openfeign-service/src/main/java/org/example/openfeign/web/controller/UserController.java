package org.example.openfeign.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.openfeign.entities.User;
import org.example.openfeign.service.UserService;
import org.example.openfeign.web.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public Result insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @GetMapping("/user")
    public Result getUser(String username) {
        log.info("username:{}",username);
        return userService.getUser(username);
    }
}
