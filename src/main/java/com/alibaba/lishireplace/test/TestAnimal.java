package com.alibaba.lishireplace.test;

import com.alibaba.lishireplace.model.Person;
import com.alibaba.lishireplace.model.Rabbit;

/**
 * @Author shenmeng
 * @Date 2019/11/18
 **/

public class TestAnimal {
    public static void main(String[] args) {
        Person person = new Person();
        person.feedAnimal(new Rabbit());
        person.walkAnimal();
    }
}
