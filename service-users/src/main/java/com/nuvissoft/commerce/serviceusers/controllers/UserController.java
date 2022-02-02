package com.nuvissoft.commerce.serviceusers.controllers;

import java.util.List;

import com.nuvissoft.commerce.serviceusers.data.domain.User;
import com.nuvissoft.commerce.serviceusers.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> readAllUsers() {
        List<User> users = userService.readAll();
        System.out.print(users);
        return users;
    }

    @PostMapping("/addNew")
    public ResponseEntity<User> addNewUser(@RequestBody User newUser) {
        User addedUser = userService.save(newUser);
        return new ResponseEntity<User>(addedUser, HttpStatus.CREATED);
    }

}
