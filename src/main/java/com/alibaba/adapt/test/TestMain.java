package com.alibaba.adapt.test;

import com.alibaba.adapt.service.ObjectTarget;
import com.alibaba.adapt.service.Target;
import com.alibaba.adapt.service.impl.Adaptee;
import com.alibaba.adapt.service.impl.Adapter;
import com.alibaba.adapt.service.impl.ObjectAdapter;

/**
 * @Author shenmeng
 * @Date 2019/11/25
 **/

public class TestMain {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethod1();
        target.targetMethod2();

        ObjectTarget objectTarget= new ObjectAdapter(new Adaptee());
        objectTarget.targetMethod1();
        objectTarget.targetMethod2();
    }
}
