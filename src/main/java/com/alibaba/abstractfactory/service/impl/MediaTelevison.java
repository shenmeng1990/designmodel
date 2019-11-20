package com.alibaba.abstractfactory.service.impl;

import com.alibaba.abstractfactory.service.Television;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class MediaTelevison implements Television {
    @Override
    public void play() {
        System.out.println("Media Televison Play!");
    }
}
