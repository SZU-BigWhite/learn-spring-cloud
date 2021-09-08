package org.example.nacos.service;

import org.example.nacos.pojo.User;
import org.example.nacos.web.vo.Result;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackService implements UserService{
    @Override
    public Result insertUser(User user) {
        return new Result("调用insertUser失败，服务被降级",500);
    }

    @Override
    public Result getUser(String username) {
        return new Result("调用getUser失败，服务被降级",500);
    }
}
