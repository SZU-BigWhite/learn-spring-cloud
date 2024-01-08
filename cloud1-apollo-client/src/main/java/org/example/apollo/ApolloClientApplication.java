package org.example.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bigwhite
 * @date 2022 -08 -09
 **/
@SpringBootApplication
@EnableApolloConfig
public class ApolloClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApolloClientApplication.class, args);
    }
}
