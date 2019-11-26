package com.alibaba.bridge.test;

import com.alibaba.bridge.service.MobilePhoneAbstaction;
import com.alibaba.bridge.service.impl.ChatSoft;
import com.alibaba.bridge.service.impl.GameSoft;
import com.alibaba.bridge.service.impl.HuaweiMobilePhone;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class TestMain {
    public static void main(String[] args) {
        MobilePhoneAbstaction m1 = new HuaweiMobilePhone(new GameSoft());
        HuaweiMobilePhone m2= new HuaweiMobilePhone(new ChatSoft());
        m1.run();
        m2.run();
        m2.gpuTurboRun();
    }
}
