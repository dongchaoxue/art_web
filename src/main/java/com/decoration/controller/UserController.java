package com.decoration.controller;

import com.decoration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongchao on 2020/8/15 11:26
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        return "success";
    }

    @RequestMapping("/addUser")
    public String addUser(String name) {

        return String.valueOf(userService.addUser(name));
    }

}
