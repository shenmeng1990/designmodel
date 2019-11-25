package com.alibaba.prototype.serializable;

import java.io.Serializable;

/**
 * @Author shenmeng
 * @Date 2019/11/22
 **/

public class Address implements Serializable {

    private Code code;

    public Address(Code code) {
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}

class Code implements Serializable{


}
