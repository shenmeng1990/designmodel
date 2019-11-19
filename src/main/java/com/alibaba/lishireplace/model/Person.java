package com.alibaba.lishireplace.model;

/**
 * @Author shenmeng
 * @Date 2019/11/18
 **/

public class Person {

    private AbstractAnimal animal;

    public void feedAnimal(AbstractAnimal abstractAnimal){
        this.animal=abstractAnimal;
    }

    public void walkAnimal(){
        System.out.println("人开始遛动物：");
        animal.dance();
    }
}
