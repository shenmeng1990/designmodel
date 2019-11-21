package com.alibaba.singleton.lazzybones;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class SingleTon {

    private static  volatile  SingleTon instance=null;

    private SingleTon(){
    }

    public static synchronized SingleTon getInstance(){
        if(instance==null){
            instance= new SingleTon();
        }
        return instance;
    }
}
