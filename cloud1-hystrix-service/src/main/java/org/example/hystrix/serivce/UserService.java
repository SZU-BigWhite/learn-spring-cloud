package org.example.hystrix.serivce;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.example.hystrix.entities.User;
import org.example.hystrix.web.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    /**
     * # 自定义属性，用于restTemplate连接的url
     * service-url:
     * user-producter: http://eureka-client-producter
     */
    @Value("${service-url.user-producter}")
    String url;

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserFallbackMethod")
    public Result getUser(String username) {
        Result result = restTemplate.getForEntity(url + "/user?username={1}", Result.class, username).getBody();
        if("bigwhite".equals(username)) {
            int num=1/0;
        }
        return result;
    }

    public Result insertUser(User user) {
        Result result = restTemplate.postForEntity(url + "/user", user, Result.class).getBody();
        return result;
    }

    public Result getUserFallbackMethod(String username){
        log.error("username:{}",username);
        return new Result("error username",500);
    }
}
