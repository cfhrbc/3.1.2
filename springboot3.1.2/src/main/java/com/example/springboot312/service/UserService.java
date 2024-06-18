package com.example.springboot312.service;

import com.example.springboot312.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);


    void updateUser(User user);


    void deleteUser(User user);


    User getUserById(long id);


    List<User> getAllUsers();
}
