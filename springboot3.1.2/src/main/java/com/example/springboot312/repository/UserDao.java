package com.example.springboot312.repository;

import com.example.springboot312.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void update(User user);

    void delete(User user);

    User findUser(long id);

    List<User> findAllUser();

}
