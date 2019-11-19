package com.alibaba.openandcloseprinciple.test;

import com.alibaba.openandcloseprinciple.service.ICar;
import com.alibaba.openandcloseprinciple.service.impl.BenzCar;
import com.alibaba.openandcloseprinciple.service.impl.FinanceBenzCar;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author shenmeng
 * @Date 2019/11/18
 **/

public class Shop4S {

    private final static List<ICar> carList = Lists.newArrayList();
    private final static List<ICar> fcarList=Lists.newArrayList();

    static {
        carList.add(new BenzCar("梅赛德斯-迈巴赫S级轿车",138d));
        carList.add(new BenzCar("梅赛德斯-AMGS",230d));
        carList.add(new BenzCar("梅赛德斯-奔驰v级",50d));
        fcarList.add(new FinanceBenzCar("梅赛德斯-迈巴赫S级轿车",138d));
        fcarList.add(new FinanceBenzCar("梅赛德斯-AMGS",230d));
        fcarList.add(new FinanceBenzCar("梅赛德斯-奔驰v级",50d));
    }

    public static void main(String[] args) {
        System.out.println("4s销售记录(不包含金融服务费)为：");
        carList.forEach(car->{
            System.out.println("车名为："+car.getName()+",价格为："+car.getPrice());
        });
        System.out.println("4s销售记录(包含金融服务费)为：");
        fcarList.forEach(car->{
            System.out.println("车名为："+car.getName()+",价格为："+car.getPrice());
        });
    }
}
