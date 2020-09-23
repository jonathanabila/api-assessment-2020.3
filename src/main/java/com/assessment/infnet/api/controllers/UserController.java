package com.assessment.infnet.api.controllers;

import com.assessment.infnet.api.model.models.User;
import com.assessment.infnet.api.model.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Add a new user")
    @PostMapping(value = "/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @ApiOperation(value = "Authenticate an user")
    @PostMapping(value = "/user")
    public boolean authenticate(@RequestParam String userName, @RequestParam String password) {
        return userService.authenticate(userName, password);
    }

    @ApiOperation(value = "Get a user by userName")
    @GetMapping(value = "/user/{userName}")
    public User userExists(@PathVariable String userName) {
        return userService.userExists(userName);
    }
}
