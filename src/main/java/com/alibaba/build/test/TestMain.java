package com.alibaba.build.test;

import com.alibaba.build.model.Director;
import com.alibaba.build.service.impl.ConcreteBuilder;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/

public class TestMain {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        director.construct();
    }
}
