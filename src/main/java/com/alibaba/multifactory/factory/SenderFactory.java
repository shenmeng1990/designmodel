package com.alibaba.multifactory.factory;

import com.alibaba.simplefactory.service.Sender;
import com.alibaba.simplefactory.service.impl.EmailSender;
import com.alibaba.simplefactory.service.impl.ExpressSender;
import com.alibaba.simplefactory.service.impl.MessageSender;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class SenderFactory {

    public Sender produceEmailSender(){
        return new EmailSender();
    }

    public Sender produceExpressSender(){
        return new ExpressSender();
    }

    public Sender produceMessageSender(){
        return new MessageSender();
    }
}

