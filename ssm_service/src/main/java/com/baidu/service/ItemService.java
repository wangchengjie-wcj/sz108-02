package com.baidu.service;

import com.baidu.pojo.Item;
import com.sun.tools.javac.jvm.Items;

import java.util.List;

public interface ItemService {
    /***
     * 列表查询
     * @return
     */
    List<Item> findAll();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Item items);
}
