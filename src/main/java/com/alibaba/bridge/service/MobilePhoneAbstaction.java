package com.alibaba.bridge.service;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public abstract class MobilePhoneAbstaction {

    protected  SoftImplementor softImplementor;

    public abstract void run();

    public MobilePhoneAbstaction(SoftImplementor softImplementor) {
        this.softImplementor = softImplementor;
    }
}
