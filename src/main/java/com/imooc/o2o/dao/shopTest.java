package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class shopTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void testinsertShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(2L);
        shop.setArea(area);
        shop.setOwner(owner);
        shop.setShopCategory(shopCategory);
        shop.setShopDesc("你好");
        shop.setPhone("12354");
        shop.setShopName("大盘鸡");
        shop.setPriority(2);
        shop.setAdvice("很满意");
        shop.setShopAddr("新疆");
        shop.setEnableStauts(2);
        shop.setCreateTime(new Date());
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1, effectedNum);
    }
}
