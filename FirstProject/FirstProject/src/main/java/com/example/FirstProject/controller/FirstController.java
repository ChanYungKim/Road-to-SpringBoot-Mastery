package com.example.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greetings")
    public String nice2MeetYou (Model model) {
        model.addAttribute("username", "CYKC0");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYou (Model model) {
        model.addAttribute("nickname", "CYKim");
        return "goodbye";
    }

}
