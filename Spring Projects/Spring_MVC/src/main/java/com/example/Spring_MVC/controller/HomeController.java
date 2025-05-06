package com.example.Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Spring_MVC.model.User;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
    	model.addAttribute("user", new User());
        return "register"; // Returns index.html (view)
    }
}

