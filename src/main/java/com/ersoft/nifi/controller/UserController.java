package com.ersoft.nifi.controller;


import com.ersoft.nifi.model.User;
import com.ersoft.nifi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userService.login(user);
    }


    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        System.out.println("123456");
        return "123";
    }
}
