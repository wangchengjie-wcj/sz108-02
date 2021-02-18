package com.baidu.pojo;

import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
public class Item {
    private Integer id;
    private String name;
    private double price;
    private String pic;
    private Date createtime;
    private String detail;
}
