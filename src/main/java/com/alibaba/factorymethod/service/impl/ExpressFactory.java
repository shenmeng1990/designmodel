package com.alibaba.factorymethod.service.impl;

import com.alibaba.factorymethod.service.Provider;
import com.alibaba.simplefactory.service.Sender;
import com.alibaba.simplefactory.service.impl.ExpressSender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class ExpressFactory implements Provider {
    @Override
    public Sender produce() {
        return new ExpressSender();
    }
}
