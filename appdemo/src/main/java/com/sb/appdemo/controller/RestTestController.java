package com.sb.appdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }


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
        return "Your fortune: You'll make a great boss! " + coachName + " " + teamName;
    }
}
