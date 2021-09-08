package org.example.nacos.web.controller;

import org.example.nacos.pojo.User;
import org.example.nacos.service.UserService;
import org.example.nacos.web.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserFeignController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public Result insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @GetMapping("/user")
    public Result getUser(@RequestParam String username){
        return userService.getUser(username);
    }
}
