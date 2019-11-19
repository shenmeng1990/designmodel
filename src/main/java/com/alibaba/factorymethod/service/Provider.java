package com.alibaba.factorymethod.service;

import com.alibaba.simplefactory.service.Sender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/
public interface Provider {

    public Sender produce();
}
