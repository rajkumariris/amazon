package com.db.amazon.product.controllers;


import com.db.amazon.product.Dtos.User.UserRequestDto;
import com.db.amazon.product.service.user.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private userService userService;

    @PostMapping("/createuser")
    public void createUser(@RequestBody UserRequestDto userDetails){
        // Logic to create a user

      userService.createUser(userDetails);

    }
}
