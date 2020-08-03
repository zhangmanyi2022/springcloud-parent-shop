package com.jk.service;

import com.jk.entity.Storerank;
import com.jk.pojo.PageResult;

import java.util.Map;

public interface StorerankService {

    public PageResult findPage(Integer page,Integer rows);

    Map findStorePage(Integer rows, Integer page, Storerank storerank);
}
