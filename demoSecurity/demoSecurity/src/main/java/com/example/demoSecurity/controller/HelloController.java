package com.example.demoSecurity.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/public")
//    public String publicApi() {
//        return "This is public API";
//    }
//
//    @GetMapping("/private")
//    public String privateApi() {
//        return "Thi";
//    }

    @GetMapping("/public")
    public String greet(HttpSession session) {
        return "Welcome to Spring Boot\nSession ID: " + session.getId();
    }

    @GetMapping("/private")
    public String hello(HttpSession session) {
        return "Hi Guys\nSession ID: " + session.getId();
    }
}