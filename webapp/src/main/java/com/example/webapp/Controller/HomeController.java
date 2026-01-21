package com.example.webapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        return "Welcome to our home Page";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is the about page of our web applications";
    }
}
