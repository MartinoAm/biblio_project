package com.dev.project.bibliotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.bibliotheque.model.Users;
import com.dev.project.bibliotheque.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getUsers() {
        List<Users> user = new ArrayList<>();
        userRepository.findAll().forEach(users -> {
            user.add(users);
        });

        return user;
    }

    public void addUser(Users user) {
        userRepository.save(user);
    }

    public Users getUsers(long id) {
        return userRepository.findById(id).orElse(null);
    }
}
