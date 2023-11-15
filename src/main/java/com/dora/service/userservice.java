package com.dora.service;

import java.util.List;  // Correct import statement

import com.dora.entity.User;

public interface userservice {
    void registerUser(User user);
    List<User> authenticateUser(String email, String password);
}