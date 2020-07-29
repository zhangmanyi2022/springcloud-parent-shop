package com.jk.service;

import com.jk.entity.UserBo;

import java.util.List;

public interface UserService {
    List<UserBo> findAll(UserBo userBo);
}
