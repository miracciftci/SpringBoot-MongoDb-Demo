package com.spring.mongoDb_demo.controller;

import com.spring.mongoDb_demo.model.User;
import com.spring.mongoDb_demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/getAllByName/{name}")
    public ResponseEntity<List<User>> getAllUserByName(@PathVariable String name) {
        return ResponseEntity.ok(userService.findByName(name));
    }



}
