package com.jk.dao;

import com.jk.entity.Storerank;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface StorerankMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Storerank record);

    int insertSelective(Storerank record);

    Storerank selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Storerank record);

    int updateByPrimaryKey(Storerank record);

    List<Storerank> findPage(@Param("rows") Integer rows, @Param("page") Integer page);

    public Long count();

    Long findStoreCount(HashMap params);

    List<Storerank> findStore(HashMap params);
}