/*
package com.rainmakers.controller;

import com.rainmakers.service.UserService;
import com.rainmakers.utils.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.rainmakers.model.User;
import com.rainmakers.utils.ResponseData;

import java.util.HashMap;
import java.util.Map;

*/
/**
 * @author Administrator
 *//*

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData login(@RequestParam String username, @RequestParam String password) {
        User user = userService.getUser(username, password);
        if (user != null) {
            ResponseData responseData = ResponseData.ok();
            responseData.putDataValue("user", user);
            String token = JWT.sign(user, 30L * 24L * 3600L * 1000L);
            if (token != null) {
                responseData.putDataValue("token", token);
            }
            return responseData;
        }
        return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[]{"用户名或密码错误"});
    }

    @RequestMapping("/getObj")
    @ResponseBody
    public Map<String, Object> getUserObj() {
        User user = new User();
        user = userService.getUser("lunjingjie", "123");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        return map;
    }
}*/
