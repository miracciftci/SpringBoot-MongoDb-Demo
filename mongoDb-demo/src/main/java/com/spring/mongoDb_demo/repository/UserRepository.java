package com.spring.mongoDb_demo.repository;

import com.spring.mongoDb_demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findUsersByName(String name);

}
