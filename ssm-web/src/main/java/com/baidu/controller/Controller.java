package com.baidu.controller;


import com.baidu.pojo.Item;
import com.baidu.service.ItemService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ItemService itemService;

    @RequestMapping("no1")
    public String method01(Model model){
        List<Item> item = itemService.findAll();
        model.addAttribute("item",item);
        return "success";
    }
}
