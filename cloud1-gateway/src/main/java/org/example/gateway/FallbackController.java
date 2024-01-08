package org.example.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author bigwhite
 * @date 2022 -08 -01
 **/
@RestController
public class FallbackController {
//    @GetMapping("/forward/hello")
    public ResponseEntity forwardHello() {
        return new ResponseEntity("/forward/hello", HttpStatus.OK);
    }
}
