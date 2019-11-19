package com.alibaba.dependreverse.test;

import com.alibaba.dependreverse.model.Customer;
import com.alibaba.dependreverse.model.XiHuShop;
import com.alibaba.dependreverse.model.YuHangShop;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class TestMain {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.shopping(new YuHangShop());
        customer.shopping(new XiHuShop());
    }
}
