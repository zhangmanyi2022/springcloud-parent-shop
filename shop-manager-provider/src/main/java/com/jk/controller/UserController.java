package com.jk.controller;

import com.jk.entity.UserBo;
import com.jk.service.UserService;
import com.jk.service.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserServiceApi {

    @Autowired
    private UserService userService;

    @Override
    public List<UserBo> findAll(UserBo userBo) {
        return userService.findAll(userBo);
    }
}
