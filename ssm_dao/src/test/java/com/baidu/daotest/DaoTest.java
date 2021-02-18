package com.baidu.daotest;

import com.baidu.dao.Itemsdao;
import com.baidu.pojo.Item;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    @Test
    public void Test01(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        Itemsdao itemDao =(Itemsdao) cpa.getBean(Itemsdao.class);
        List<Item> items = itemDao.findAll();
        items.forEach(System.out::println);
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        Itemsdao i = cpa.getBean(Itemsdao.class);
        Item item = new Item();
        int save = i.save(item);
    }
}
