package com.iuroc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuroc.demo.mapper.UserMapper;
import com.iuroc.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    public final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/")
    public String index() {
        return "Hello User";
    }

    @GetMapping("/create")
    public String create() {
        User newUser = new User("张三", 20);
        userMapper.insert(newUser);
        return "Create Success";
    }
}