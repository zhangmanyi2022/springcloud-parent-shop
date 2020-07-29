package com.jk.dao;

import com.jk.entity.UserBo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from test_user")
    List<UserBo> findAll(UserBo userBo);
}
