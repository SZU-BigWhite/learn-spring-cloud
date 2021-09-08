package org.example.nacos.service;

import org.example.nacos.pojo.User;
import org.example.nacos.web.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-user-service",fallback = UserFallbackService.class)
public interface UserService {
    @PostMapping("/user")
    public Result insertUser(@RequestBody User user);

    @GetMapping("/user")
    public Result getUser(@RequestParam String username);
}
