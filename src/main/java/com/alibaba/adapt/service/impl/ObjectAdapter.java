package com.alibaba.adapt.service.impl;


import com.alibaba.adapt.service.ObjectTarget;
import com.alibaba.adapt.service.Target;

/**
 * @Author shenmeng
 * @Date 2019/11/25
 **/

public class ObjectAdapter extends ObjectTarget {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod1() {
        System.out.println("ObjectAdapter targetMethod1 invoke");
        adaptee.methodA();
    }

    @Override
    public void targetMethod2() {
        System.out.println("ObjectAdapter targetMethod2 invoke");
        adaptee.methodB();
    }
}
