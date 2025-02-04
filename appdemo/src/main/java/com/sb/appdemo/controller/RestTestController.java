package com.sb.appdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @GetMapping("/")
    public String testOne() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getWorkout() {
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Your fortune: You'll make a great boss!";
    }

}
