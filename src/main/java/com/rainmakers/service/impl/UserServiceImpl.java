package com.rainmakers.service.impl;

import com.rainmakers.mapper.UserMapper;
import com.rainmakers.model.User;
import com.rainmakers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String username, String password) {
        return userMapper.getUser(username, password);
    }
}
