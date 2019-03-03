package com.github.eciuca.sda.mywebapp.auth.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
