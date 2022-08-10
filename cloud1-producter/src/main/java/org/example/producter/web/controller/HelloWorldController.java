package org.example.producter.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bigwhite
 * @date 2022 -08 -01
 **/
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity helloWorld() {
        return new ResponseEntity("Hello world!!", HttpStatus.OK);
    }

    @GetMapping("/exception")
    public ResponseEntity exceptionMethod() {

        int i = 1 / 0;
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
