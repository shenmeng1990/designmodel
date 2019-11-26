package com.alibaba.filter.test;

import com.alibaba.filter.model.Rubbish;
import com.alibaba.filter.service.impl.DryRubbishCriteria;
import com.alibaba.filter.service.impl.HarmRubbishCriteria;
import com.alibaba.filter.service.impl.RecycleRubbishCriteria;
import com.alibaba.filter.service.impl.WetRubbishCriteria;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class TestMain {
    public static void main(String[] args) {
        List<Rubbish> rubbishes = Lists.newArrayList();

        rubbishes.add(new Rubbish("果壳",false,false,true,false));
        rubbishes.add(new Rubbish("陶瓷",false,false,true,false));
        rubbishes.add(new Rubbish("果皮",false,false,false,true));
        rubbishes.add(new Rubbish("菜根菜叶",false,false,false,true));
        rubbishes.add(new Rubbish("水银温度计",true,false,false,false));
        rubbishes.add(new Rubbish("电池",true,false,false,false));
        rubbishes.add(new Rubbish("灯泡",true,false,false,false));
        rubbishes.add(new Rubbish("废纸塑料",false,true,false,false));
        rubbishes.add(new Rubbish("金属和布料",false,true,false,false));
        rubbishes.add(new Rubbish("玻璃",false,true,false,false));

        DryRubbishCriteria dry=new DryRubbishCriteria();
        WetRubbishCriteria wet=new WetRubbishCriteria();
        HarmRubbishCriteria harm=new HarmRubbishCriteria();
        RecycleRubbishCriteria recycle=new RecycleRubbishCriteria();

        System.out.println("干垃圾：");
        printRubbish(dry.rubbishFilter(rubbishes));
        System.out.println("\t");

        System.out.println("湿垃圾:");
        printRubbish(wet.rubbishFilter(rubbishes));
        System.out.println("\t");

        System.out.println("有害垃圾:");
        printRubbish(harm.rubbishFilter(rubbishes));
        System.out.println("\t");

        System.out.println("可回收垃圾:");
        printRubbish(recycle.rubbishFilter(rubbishes));
        System.out.println("\t");
    }

    protected  static void printRubbish(List<Rubbish> rubbishes){
        rubbishes.forEach(rubbish -> {
            System.out.println(rubbish.getName());
        });
    }
}
