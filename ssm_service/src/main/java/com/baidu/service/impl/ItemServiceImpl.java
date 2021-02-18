package com.baidu.service.impl;

import com.baidu.dao.Itemsdao;
import com.baidu.pojo.Item;
import com.baidu.service.ItemService;
import com.sun.tools.javac.jvm.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    //注入spring-dao
    @Autowired
    private Itemsdao itemsdao;
    @Override
    public List<Item> findAll() {
        List<Item> all = itemsdao.findAll();
        return all;
    }

    @Override
    public int save(Item items) {
        int save = itemsdao.save(items);
        return save;
    }
}
