package com.alibaba.simplefactory.test;

import com.alibaba.simplefactory.factory.SenderFactory;
import com.alibaba.simplefactory.service.Sender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class TestMain {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender email = senderFactory.produceSender("email");
        email.send();
        Sender message = senderFactory.produceSender("message");
        message.send();
        Sender express = senderFactory.produceSender("express");
        express.send();
    }
}
