package org.example.apollo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author bigwhite
 * @date 2022 -08 -09
 **/
@RestController
public class ApolloTestController {

    @Value(value = "${mxn.name}")
    private String name;

    @GetMapping("/apollo/test")
    public String test() {
        return "hello world " + name;
    }
}
