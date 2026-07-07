//package com.db.amazon.auth.controller;
//
//import com.db.amazon.auth.dtos.RegisterDto;
//import com.db.amazon.auth.services.authService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/auth")
//public class authController {
//
//    @Autowired
//    private authService authService;
//
//    @PostMapping("/login")
//    public String login() {
//        return "Login successful";
//    }
//
//
//    @PostMapping("/register")
//    public String register(@RequestBody RegisterDto registerRequest) {
//
//        authService.register(registerRequest);
//
//        return "Registration successful";
//    }
//}
