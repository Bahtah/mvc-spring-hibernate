package com.surantaev.spring.service;

import com.surantaev.spring.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(int id);
    void deleteUser(int id);
}
