package com.jk.controller;

import com.jk.entity.Storerank;
import com.jk.pojo.PageResult;
import com.jk.service.StorerankApi;
import com.jk.service.StorerankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StorerankController implements StorerankApi {

    @Autowired
    private StorerankService storerankService;

    @Override
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam(value = "page",defaultValue = "1") Integer page,@RequestParam(value = "rows",defaultValue = "5") Integer rows){
        return storerankService.findPage(page,rows);
    }

    @Override
    @RequestMapping("/findStorePage")
    public Map findPage(@RequestParam(value = "rows",defaultValue = "2") Integer rows,@RequestParam(value = "page",defaultValue = "1") Integer page, Storerank storerank) {
        return storerankService.findStorePage(rows,page,storerank);
    }

}
