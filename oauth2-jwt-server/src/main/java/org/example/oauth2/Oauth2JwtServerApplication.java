package org.example.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2JwtServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2JwtServerApplication.class,args);
    }
}
