package com.imooc.o2o.entity;

import lombok.Data;

import java.util.*;

@Data
public class Area {
    //ID 用引用类型是因为如果用基本类型会有默认值
    private Integer areaId;
    //名称
    private String areaName;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

}

