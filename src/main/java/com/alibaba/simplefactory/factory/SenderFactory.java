package com.alibaba.simplefactory.factory;

import com.alibaba.simplefactory.service.Sender;
import com.alibaba.simplefactory.service.impl.EmailSender;
import com.alibaba.simplefactory.service.impl.ExpressSender;
import com.alibaba.simplefactory.service.impl.MessageSender;
import org.apache.commons.lang.StringUtils;

/**
 * @Author shenmeng
 * @Date 2019/11/19
 **/

public class SenderFactory {

    public Sender produceSender(String type){
        if(StringUtils.isEmpty(type)){
            return null;
        }else if("email".equals(type)){
            return new EmailSender();
        }else if("message".equals(type)){
            return new MessageSender();
        }else if("express".equals(type)){
            return new ExpressSender();
        }else{
            return null;
        }
    }
}
