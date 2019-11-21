package com.alibaba.singleton.hungrymode;

/**
 * @Author shenmeng
 * @Date 2019/11/20
 **/

public class TestSingleTon {

    public static void main(String[] args) {
        SingleTon s1= SingleTon.getInstance();
        SingleTon s2 =SingleTon.getInstance();
        System.out.println(s1==s2);
    }
}
