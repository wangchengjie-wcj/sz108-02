package com.baidu;

import com.baidu.service.ItemService;
import com.baidu.service.impl.ItemServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void method01(){
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("classpath:spring-sercice.xml");
        ItemService bean = cpa.getBean(ItemService.class);
        bean.findAll().forEach(System.out::println);
    }
}
