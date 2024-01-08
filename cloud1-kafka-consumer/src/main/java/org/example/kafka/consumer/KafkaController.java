package org.example.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author bigwhite
 * @date 2022 -08 -10
 **/
@RestController
@Slf4j
public class KafkaController {
    private final static String TOPIC_NAME = "my-replicated-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(@RequestParam("msg") String msg) {
        kafkaTemplate.send(TOPIC_NAME, "key", msg);
        return String.format("消息 %s 发送成功！", msg);
    }

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @GetMapping("/test/{input}")
    public ResponseEntity sendFoo(@PathVariable String input) {
        this.template.send("topic_input", input);
        return ResponseEntity.ok("ok");
    }
    @GetMapping("/hello")
    public ResponseEntity sendFoo() {
        return ResponseEntity.ok("hello");
    }
    @KafkaListener(id = "webGroup", topics = "topic_input")
    public void listen(String input) {
        log.info("input value: {}" , input);
    }
}

