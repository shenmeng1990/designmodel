package com.alibaba.prototype.model;


import java.util.Date;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/
public class Person implements Cloneable{

    private int age;

    private Date birth;

    private Address address;

    public Person(int age, Date birth,Address address) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p=(Person)super.clone();
        p.birth=(Date)birth.clone();
        p.address=(Address)address.clone();
        return p;
    }

    public static void main(String[] args) throws Exception{
        Date date = new Date();
        Address address = new Address(new Code());
        Person p1 = new Person(23,date,address);
        Person p2 =(Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);


        System.out.println(p1.getAddress());
        System.out.println(p2.getAddress());

        System.out.println(p1.getAddress().getCode());
        System.out.println(p2.getAddress().getCode());

    }
}
