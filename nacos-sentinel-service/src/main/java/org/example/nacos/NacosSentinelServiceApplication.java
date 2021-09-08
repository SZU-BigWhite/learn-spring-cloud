package org.example.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class NacosSentinelServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosSentinelServiceApplication.class,args);
    }
}
