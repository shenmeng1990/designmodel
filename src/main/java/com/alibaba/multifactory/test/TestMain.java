package com.alibaba.multifactory.test;

import com.alibaba.multifactory.factory.SenderFactory;
import com.alibaba.simplefactory.service.Sender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class TestMain {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender emailSender = senderFactory.produceEmailSender();
        emailSender.send();
        Sender expressSender = senderFactory.produceExpressSender();
        expressSender.send();
        Sender messageSender = senderFactory.produceMessageSender();
        messageSender.send();
    }
}
