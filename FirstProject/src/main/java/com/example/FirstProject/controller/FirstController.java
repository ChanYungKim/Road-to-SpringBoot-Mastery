package com.example.FirstProject.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    public String niceToMeetYou () {
        return "greetings";
    }
}
