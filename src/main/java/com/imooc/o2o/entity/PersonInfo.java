package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PersonInfo {
    private Long userId;

    private String name;

    private String profileImg;

    private String email;

    private String gender;

    private Integer enableStatus;

    private Integer userType;
    //1顾客 2商家 3超级管理员
    private Date creaTime;

    private Date lastEditTime;
}
