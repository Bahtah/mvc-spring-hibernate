package com.surantaev.spring.dao;

import com.surantaev.spring.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(int id);
    void deleteUser(int id);
}
