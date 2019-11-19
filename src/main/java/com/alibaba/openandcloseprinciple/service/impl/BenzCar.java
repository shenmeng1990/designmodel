package com.alibaba.openandcloseprinciple.service.impl;

import com.alibaba.openandcloseprinciple.service.ICar;

/**
 * @Author shenmeng
 * @Date 2019/11/18
 **/

public class BenzCar implements ICar {

    private String name;

    private Double price;

    public BenzCar(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
