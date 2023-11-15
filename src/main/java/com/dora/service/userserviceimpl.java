package com.dora.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dora.entity.User;
import com.dora.repo.userrepo;

@Service
public class userserviceimpl implements userservice {

    @Autowired
    private userrepo userRepository;

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return Collections.singletonList(user);
        } else {
            return Collections.emptyList();
        }
    }
}
