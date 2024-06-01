package com.dev.project.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.project.bibliotheque.model.Users;
import com.dev.project.bibliotheque.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/listUser")
    public List<Users> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/addUser")
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }

    @RequestMapping("/listUserbyId/{id}")
    public Users getUsersbyId(@PathVariable long id) {
        return userService.getUsers(id);
    }
}
