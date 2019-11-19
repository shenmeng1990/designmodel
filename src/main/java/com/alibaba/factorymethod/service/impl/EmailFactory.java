package com.alibaba.factorymethod.service.impl;

import com.alibaba.factorymethod.service.Provider;
import com.alibaba.simplefactory.service.Sender;
import com.alibaba.simplefactory.service.impl.EmailSender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class EmailFactory implements Provider {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
