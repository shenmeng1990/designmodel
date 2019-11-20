package com.alibaba.abstractfactory.test;

import com.alibaba.abstractfactory.service.Factory;
import com.alibaba.abstractfactory.service.impl.MediaFactory;
import com.alibaba.abstractfactory.service.impl.TclFactory;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class TestMain {
    public static void main(String[] args) {
        Factory tclFactory = new TclFactory();
        tclFactory.newTelevison().play();
        tclFactory.newRefrigerator().wash();

        Factory mediaFactory = new MediaFactory();
        mediaFactory.newTelevison().play();
        mediaFactory.newRefrigerator().wash();
    }
}
