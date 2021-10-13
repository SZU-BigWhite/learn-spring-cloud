package org.example.oauth2;

import org.example.oauth2.test.Thread1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class Oauth2ServerApplication {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        new Thread(thread1).start();
        SpringApplication.run(Oauth2ServerApplication.class,args);
    }
}
