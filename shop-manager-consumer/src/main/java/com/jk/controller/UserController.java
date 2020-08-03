package com.jk.controller;

import com.jk.entity.UserBo;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired(required = true)
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserBo> findAll(UserBo userBo){
        return userService.findAll(userBo);
    }

}
