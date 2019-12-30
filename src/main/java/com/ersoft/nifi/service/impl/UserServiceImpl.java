package com.ersoft.nifi.service.impl;

import com.ersoft.nifi.dao.UserMapper;
import com.ersoft.nifi.model.User;
import com.ersoft.nifi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(User user) {
        User u = null;
        List<User> list = new ArrayList<User>();
        u = userMapper.login_select(user);

        if(u!=null){
            return u;
        }else{
            return null;
        }


    }


}
