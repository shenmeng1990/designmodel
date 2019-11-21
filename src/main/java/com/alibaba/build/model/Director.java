package com.alibaba.build.model;

import com.alibaba.build.service.Builder;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Building construct(){
        builder.buildGround();
        builder.buildCement();
        builder.buildRoof();
        Building building = builder.buildBuilding();
        return building;
    }
}
