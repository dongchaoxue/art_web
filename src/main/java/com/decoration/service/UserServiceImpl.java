package com.decoration.service;

import com.decoration.domain.User;
import com.decoration.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by dongchao on 2020/8/15 11:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public Integer addUser(String name) {

        User user = new User();
        user.setUserName(name);
        user.setCreateTime(new Date());
        userMapper.addUser(user);
        return user.getId();
    }
}
