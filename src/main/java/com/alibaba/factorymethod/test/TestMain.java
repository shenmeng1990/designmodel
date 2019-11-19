package com.alibaba.factorymethod.test;

import com.alibaba.factorymethod.service.impl.EmailFactory;
import com.alibaba.factorymethod.service.impl.ExpressFactory;
import com.alibaba.factorymethod.service.impl.MessageFactory;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class TestMain {
    public static void main(String[] args) {
        ExpressFactory expressFactory = new ExpressFactory();
        expressFactory.produce().send();
        MessageFactory messageFactory = new MessageFactory();
        messageFactory.produce().send();
        EmailFactory emailFactory =new EmailFactory();
        emailFactory.produce().send();
    }
}
