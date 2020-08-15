package com.decoration.controller;

import com.decoration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by dongchao on 2020/8/15 11:26
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toAddUser")
    public ModelAndView toAddUser(){
        ModelAndView view = new ModelAndView();
        view.setViewName("userAdd");
        view.addObject("time", new Date());
        return view;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(String name) {

        return String.valueOf(userService.addUser(name));
    }

}
