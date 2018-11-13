package com.codegym.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @Value("Welcome!")
    private String message = "Welcome!";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model){
        model.put("message", this.message);
        return "welcome";
    }
}
