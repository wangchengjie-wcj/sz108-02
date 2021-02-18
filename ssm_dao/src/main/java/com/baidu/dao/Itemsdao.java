package com.baidu.dao;

import com.baidu.pojo.Item;

import java.util.List;

public interface Itemsdao {
    //查询所有
    List<Item> findAll();

    //存入数据
    int save(Item item);

}
