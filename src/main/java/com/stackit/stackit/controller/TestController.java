package com.stackit.stackit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/questions/test")
    public String test() {
        return "JWT Authentication Success!";
    }

}