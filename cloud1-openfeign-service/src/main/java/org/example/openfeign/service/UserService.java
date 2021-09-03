package org.example.openfeign.service;

import org.example.openfeign.entities.User;
import org.example.openfeign.web.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-producter")
public interface UserService {
    @PostMapping("/user")
    Result insertUser(@RequestBody User user) ;

    /**
     * 属性参数必须加@RequestParam
     * @param username
     * @return
     */
    @GetMapping("/user")
    Result getUser(@RequestParam String username);
}
