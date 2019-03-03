package com.github.eciuca.sda.mywebapp.auth.service;

import com.github.eciuca.sda.mywebapp.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
