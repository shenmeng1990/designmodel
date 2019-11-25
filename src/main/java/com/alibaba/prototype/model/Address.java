package com.alibaba.prototype.model;

/**
 * @Author shenmeng
 * @Date 2019/11/22
 **/

public class Address implements Cloneable{

    private Code code;

    public Address(Code code) {
        this.code = code;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address=(Address)super.clone();
        address.code=(Code)code.clone();
        return address;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}

class Code implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
