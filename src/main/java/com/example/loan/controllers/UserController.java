package com.example.loan.controllers;

import com.example.loan.models.User;
import com.example.loan.services.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class UserController {

    TestUserService testUserService;

    @Autowired
    public void setTestUserService(TestUserService testUserService) {
        this.testUserService = testUserService;
    }

    @GetMapping("/users")
    public HashMap<Long, User> getUsers() {
        return testUserService.getUsuarios();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return testUserService.getUser(id);
    }


}
