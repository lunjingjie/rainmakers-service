package com.rainmakers.service;

import com.rainmakers.model.User;

public interface UserService {

    /**
     * 获取一个user对象
     * @param username
     * @param password
     * @return user
     */
    User getUser(String username, String password);

}
