package com.jk.service;

import com.jk.entity.UserBo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface UserServiceApi {

    @RequestMapping(value = "/findAll")
    List<UserBo> findAll(@RequestBody UserBo userBo);
}
