package com.example.learning.controller;

import com.example.learning.entity.Accounts;
import com.example.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/user")
    public String getUser() {
        return "Hello from get user";
    }

    @PostMapping("/user")
    public Accounts saveUser(
            @RequestBody Accounts accounts
    ) {
        return service.saveUser(accounts);
    }
}
