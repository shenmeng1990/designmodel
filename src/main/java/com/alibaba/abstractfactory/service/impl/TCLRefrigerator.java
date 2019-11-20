package com.alibaba.abstractfactory.service.impl;

import com.alibaba.abstractfactory.service.Refrigerator;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class TCLRefrigerator implements Refrigerator {
    @Override
    public void wash() {
        System.out.println("TCL Refrigerator Wash!");
    }
}
