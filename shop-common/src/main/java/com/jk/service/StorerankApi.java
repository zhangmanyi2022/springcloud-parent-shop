package com.jk.service;

import com.jk.entity.Storerank;
import com.jk.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


public interface StorerankApi {

    @RequestMapping(value = "/findPage")
    PageResult findPage(@RequestParam("rows") Integer rows,@RequestParam("page") Integer page);

    @RequestMapping(value = "/findStorePage")
    Map findPage(@RequestParam("rows") Integer rows, @RequestParam("page") Integer page,Storerank storerank);
}
