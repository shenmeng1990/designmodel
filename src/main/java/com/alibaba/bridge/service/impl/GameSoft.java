package com.alibaba.bridge.service.impl;

import com.alibaba.bridge.service.SoftImplementor;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class GameSoft extends SoftImplementor {
    @Override
    public void rawRun() {
        System.out.println("GameSoft running!");
    }
}
