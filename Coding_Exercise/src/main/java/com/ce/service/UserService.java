package com.ce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ce.entity.User;

@Service
public class UserService {

    private Map<Long, User> users = new HashMap<>();
    private Long nextUserId = 1L;

    public List<User> findUsersByUsername(String username) {
        return users.values().stream()
                .filter(user -> user.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User replaceUser(Long id, User newUser) {
        if (users.containsKey(id)) {
            newUser.setId(id);
            users.put(id, newUser);
            return newUser;
        } else {
            return null; // User not found
        }
    }
}