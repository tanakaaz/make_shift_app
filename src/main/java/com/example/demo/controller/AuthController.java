// package com.example.demo.controller;
// import jakarta.servlet.http.HttpSession;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.example.demo.Service.UserService;

// @Controller
// public class AuthController {
//     @Autowired
//     private UserService userService;
//     @PostMapping("/login")
//     public String login(@RequestParam(name="userName") String username,@RequestParam(name="password")String password, HttpSession session) {
//         if (userService.login(username, password)){
//             session.setAttribute("user", username);
//             return "redirect:/home";
//         }
//         return "redirect:/login?error";
//     }
// }