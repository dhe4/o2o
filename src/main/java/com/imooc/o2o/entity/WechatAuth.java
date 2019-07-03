package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

@Data
public class WechatAuth {
    private Long wechatAuthId;

    private Long openId;

    private Date creatTime;

    private PersonInfo personInfo;
}
