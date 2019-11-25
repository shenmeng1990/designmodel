package com.alibaba.adapt.service.impl;

import com.alibaba.adapt.service.Target;

/**
 * @Author shenmeng
 * @Date 2019/11/25
 **/

public class Adapter extends Adaptee implements Target {


    @Override
    public void targetMethod1() {
        System.out.println("adapter targetMethod1 invoke!");
        methodA();
    }

    @Override
    public void targetMethod2() {
        System.out.println("adapter targetMethod2 invoke!");
        methodB();
    }
}
