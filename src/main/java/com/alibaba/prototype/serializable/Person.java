package com.alibaba.prototype.serializable;


import java.io.*;
import java.util.Date;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/
public class Person implements Serializable {

    private int age;

    private Date birth;

    private Address address;

    public Person(int age, Date birth, Address address) {
        this.age = age;
        this.birth = birth;
        this.address=address;
    }

    public Person() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }


    public static void main(String[] args) throws Exception{
        Date date = new Date();
        Address address = new Address(new Code());
        Person p1 = new Person(23,date,address);

        //将p1序列化存储
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(p1);

        //反序列化实现p1的拷贝
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Person p2 = (Person)ois.readObject();

        System.out.println(p1==p2);
        System.out.println(p1.getAddress()==p2.getAddress());
        System.out.println(p1.getAddress().getCode()==p2.getAddress().getCode());

    }
}
