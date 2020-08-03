package com.jk.controller;

import com.jk.entity.Storerank;
import com.jk.pojo.PageResult;
import com.jk.service.StorerankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(("/memberRank"))
public class StorerankController {

    @Autowired(required = true)
    private StorerankService storerankService;

    @RequestMapping("/findAll")
    @ResponseBody
    public PageResult findPage(@RequestParam(value = "page",defaultValue = "1") Integer page,@RequestParam(value = "rows",defaultValue = "5") Integer rows){
        return storerankService.findPage(rows,page);
    }

}
