package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Product {
    private Long productId;

    private String productName;

    private String productDesc;

    //简略图
    private String imgAddr;

    private String normalPrice;

    private String promotionPrice;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

    //0不可用 1在前端展示
    private Integer enableStauts;

    private List<ProductImg> productImgList;
    private ProductCategory productCategory;
    private Shop shop;


}
