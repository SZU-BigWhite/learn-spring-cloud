package org.example.hystrix.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.hystrix.entities.User;
import org.example.hystrix.serivce.UserService;
import org.example.hystrix.web.vo.Result;
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

    /**
     * 服务降级测试接口
     * 当username==bigwhite时，服务发生降级
     * @param username
     * @return
     */
    @GetMapping("/user")
    public Result getUser(String username) {
        return userService.getUser(username);
    }
}
