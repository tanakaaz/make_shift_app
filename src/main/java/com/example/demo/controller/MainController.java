package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        return "index";
    }
}