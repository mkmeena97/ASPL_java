package com.example.Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUser(Model model) {
        model.addAttribute("name", "John Doe");
        return "user"; // user.html (view)
    }
}

