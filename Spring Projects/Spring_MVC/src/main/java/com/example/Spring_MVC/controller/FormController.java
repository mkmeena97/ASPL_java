package com.example.Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Spring_MVC.model.User;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    private List<User> userList = new ArrayList<>();

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User()); // Create a new empty user
        return "register"; // Shows register.html
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        userList.add(user); // Add the user to the list
        model.addAttribute("message", "User registered successfully!");
        return "success"; // Shows success.html
    }

    @GetMapping("/get-user")
    public String getUser(Model model) {
        if (userList.isEmpty()) {
            model.addAttribute("message", "No users found.");
            return "user"; // user.html (view)
        }
        model.addAttribute("users", userList); // Pass the list of users to the view
        return "user"; // user.html (view)
    }
}
