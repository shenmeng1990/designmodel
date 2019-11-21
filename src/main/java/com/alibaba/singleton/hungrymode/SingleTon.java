package com.alibaba.singleton.hungrymode;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class SingleTon {

    private static final SingleTon instance=new SingleTon();

    private SingleTon(){

    }

    public static  SingleTon getInstance(){
        return instance;
    }
}
