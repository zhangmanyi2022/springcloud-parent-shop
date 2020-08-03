package com.jk.service.impl;

import com.jk.dao.StorerankMapper;
import com.jk.entity.Storerank;
import com.jk.pojo.PageResult;
import com.jk.service.StorerankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StorerankServiceImpl implements StorerankService {

    @Autowired
    private StorerankMapper storerankMapper;

    @Override
    public PageResult findPage( Integer page, Integer rows) {

        List<Storerank> storerankList = storerankMapper.findPage(page,rows);
        Long total = storerankMapper.count();
        Long totalPage = total%rows == 0 ? total/rows : (total/rows + 1);
        return new PageResult(total, storerankList, page, rows, totalPage);
    }

    @Override
    public Map findStorePage(Integer rows, Integer page, Storerank storerank) {
        HashMap result = new HashMap<>();
        HashMap params = new HashMap<>();
        params.put("Store", storerank);
        Long count=storerankMapper.findStoreCount(params);
        result.put("total", count);
        params.put("start", (page-1)*rows);
        params.put("end", rows);
        List<Storerank> bookbean=storerankMapper.findStore(params);
        result.put("rows", bookbean);



        return result;
    }





}
