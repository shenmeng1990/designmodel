package com.alibaba.dependreverse.model;

import com.alibaba.dependreverse.service.Shop;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class YuHangShop implements Shop {
    @Override
    public String sell() {
        return "余杭店售卖";
    }
}
