package com.ersoft.nifi.service;


import com.ersoft.nifi.model.User;

public interface UserService {
    User login(User user);
}
