package com.alibaba.build.service;

import com.alibaba.build.model.Building;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/

public interface Builder {

    void buildGround();

    void buildCement();

    void buildRoof();

    Building buildBuilding();

}
