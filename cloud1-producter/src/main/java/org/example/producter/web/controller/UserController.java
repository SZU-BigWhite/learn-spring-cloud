package org.example.producter.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.producter.entities.User;
import org.example.producter.service.UserService;
import org.example.producter.web.vo.Result;
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
        log.info("insert User :{}", user);
        boolean isInsert = userService.insertUser(user);
        if (isInsert == true) {
            return new Result("insert user success", 201);
        }
        return new Result("insert user fail", 200);
    }

    @GetMapping("/user")
    public Result getUser(String username) {
        log.info("get User :{}", username);
        return new Result(userService.findByUserName(username), "get User success", 200);
    }
}
