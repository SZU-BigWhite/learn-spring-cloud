package org.example.nacos.web.controller;

import org.example.nacos.entities.User;
import org.example.nacos.web.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class UserRibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String userProducterUrl;

    @PostMapping("/user")
    public Result insertUser(@RequestBody User user) {
        ResponseEntity<Result> responseEntity = restTemplate.postForEntity(userProducterUrl+"/user", user, Result.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            return responseEntity.getBody();
        }
        return new Result("insert user fail", 200);
    }

    @GetMapping("/user")
    public Result getUser(String username) {
        HashMap<String,String> params=new HashMap<>();
        params.put("username",username);
        ResponseEntity<Result> responseEntity = restTemplate.getForEntity(userProducterUrl+"/user?username={username}", Result.class, params);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        }
        return new Result("get user fail", 500);
    }

}
