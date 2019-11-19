package com.alibaba.dependreverse.model;

import com.alibaba.dependreverse.service.Shop;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class XiHuShop implements Shop {
    @Override
    public String sell() {
        return "西湖店售卖";
    }
}
