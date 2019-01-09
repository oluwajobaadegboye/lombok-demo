package com.example.lombokdemo.controller;


import com.example.lombokdemo.model.User;
import com.example.lombokdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findAllUsers() {

        return userService.findAllUser();

    }

}
