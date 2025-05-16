package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "users";
    }

    @GetMapping("/users/new")
    public String showAddForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("/users")
    public String addUser(Model model,@ModelAttribute User user) {
        userRepo.save(user);
        model.addAttribute("users",userRepo.findAll());
        return "users";
    }
}
