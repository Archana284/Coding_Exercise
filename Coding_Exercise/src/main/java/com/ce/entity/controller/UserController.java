package com.ce.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ce.entity.User;
import com.ce.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> listUsers(@RequestParam(required = false) String username) {
        List<User> users;
        if (username != null && !username.isEmpty()) {
            users = userService.findUsersByUsername(username);
        } else {
            users = userService.getAllUsers();
        }
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> replaceUser(@PathVariable Long id, @RequestBody User newUser) {
        User updatedUser = userService.replaceUser(id, newUser);
        return ResponseEntity.ok(updatedUser);
    }
}

