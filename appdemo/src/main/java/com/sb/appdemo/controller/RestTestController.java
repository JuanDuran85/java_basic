package com.sb.appdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @GetMapping("/")
    public String testOne() {
        return "Hello World";
    }
}
