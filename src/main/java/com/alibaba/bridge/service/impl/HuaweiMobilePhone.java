package com.alibaba.bridge.service.impl;

import com.alibaba.bridge.service.MobilePhoneAbstaction;
import com.alibaba.bridge.service.SoftImplementor;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class HuaweiMobilePhone extends MobilePhoneAbstaction {

    public HuaweiMobilePhone(SoftImplementor softImplementor) {
        super(softImplementor);
    }

    @Override
    public void run() {
        this.softImplementor.rawRun();
    }

    public void gpuTurboRun(){
        System.out.println("GPU turbo run start....");
        this.run();
        System.out.println("GPU turbo run end....");
    }
}
