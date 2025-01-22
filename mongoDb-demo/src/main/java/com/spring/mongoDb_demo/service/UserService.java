package com.spring.mongoDb_demo.service;

import com.spring.mongoDb_demo.model.User;
import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    List<User> findByName(String name);
}
