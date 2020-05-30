package com.example.spring.demo.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

}
