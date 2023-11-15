package com.dora.controller;

import java.util.List; // Correct import statement

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dora.entity.User;
import com.dora.service.userserviceimpl;

@Controller
public class usercontroller {
    @Autowired
    userserviceimpl serv;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register(Model model) {
        User us = new User();
        model.addAttribute("us", us);
        return "register";
    }

    @PostMapping("/registeruser")
    // @ResponseBody
    public String registeruser(@ModelAttribute("us") User us) {
        System.out.println(us);
        serv.registerUser(us);
        return "redirect:home";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        List<User> authenticatedUsers = serv.authenticateUser(email, password);

        if (authenticatedUsers.size() == 1) {
            // Authentication successful
            User authenticatedUser = authenticatedUsers.get(0);
            model.addAttribute("user", authenticatedUser);
            return "profile";
        } else {
            // Authentication failed
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }
}
