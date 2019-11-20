package com.alibaba.abstractfactory.service.impl;

import com.alibaba.abstractfactory.service.Factory;
import com.alibaba.abstractfactory.service.Refrigerator;
import com.alibaba.abstractfactory.service.Television;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class MediaFactory implements Factory {
    @Override
    public Television newTelevison() {
        return new MediaTelevison();
    }

    @Override
    public Refrigerator newRefrigerator() {
        return new MediaRefrigerator();
    }
}
