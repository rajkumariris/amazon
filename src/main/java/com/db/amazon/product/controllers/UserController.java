package com.db.amazon.product.controllers;


import com.db.amazon.product.Dtos.User.UserRequestDto;
import com.db.amazon.product.models.User.User;
import com.db.amazon.product.service.user.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private userService userService;

    @PostMapping("/createuser")
    public User createUser(@RequestBody UserRequestDto userDetails){
        // Logic to create a user

     return userService.createUser(userDetails);

    }


    @GetMapping("/getuser")
    public User getUserById(Long userId){
        return userService.getUserById(userId);
    }
}
