package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class MainController {

    @GetMapping("/")
    public String sayHello(Model model) {
        System.out.println("Aa");
        model.addAttribute("message","いぇえ");
        return "index";
    }
}