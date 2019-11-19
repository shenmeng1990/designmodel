package com.alibaba.dependreverse.model;

import com.alibaba.dependreverse.service.Shop;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class Customer {

    public void shopping(Shop shop){
        System.out.println(shop.sell());
    }

}
