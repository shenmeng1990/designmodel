package com.alibaba.simplefactory.service.impl;

import com.alibaba.simplefactory.service.Sender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class ExpressSender implements Sender {
    @Override
    public void send() {
        System.out.println("Express send!");
    }
}
