package com.alibaba.build.service.impl;

import com.alibaba.build.model.Building;
import com.alibaba.build.service.Builder;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/

public class ConcreteBuilder implements Builder {

    private final  Building building = new Building();

    @Override
    public void buildGround() {
        System.out.println("构建地基");
        building.setGround("");
    }

    @Override
    public void buildCement() {
        System.out.println("浇灌水泥");
        building.setCement("浇灌水泥");
    }

    @Override
    public void buildRoof() {
        System.out.println("封顶");
        building.setRoof("封顶");
    }

    @Override
    public Building buildBuilding() {
        System.out.println("建造完毕");
        return building;
    }
}
