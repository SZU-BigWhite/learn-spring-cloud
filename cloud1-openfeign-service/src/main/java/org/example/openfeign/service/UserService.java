package org.example.openfeign.service;

import org.example.openfeign.entities.User;
import org.example.openfeign.web.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "eureka-client-producter")
public interface UserService {
    @PostMapping("/user")
    Result insertUser(@RequestBody User user) ;

    /**
     * param加@RequestParam
     * post body 加 @RequestBody
     * path value 加 @PathVariable
     * @param username
     * @return
     */
    @GetMapping("/user")
    Result getUser(@RequestParam String username);
}
