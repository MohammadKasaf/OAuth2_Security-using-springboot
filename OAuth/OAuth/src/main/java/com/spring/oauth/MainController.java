package com.spring.oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "welcome";
    }

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
