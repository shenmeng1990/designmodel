package com.alibaba.build.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author shenmeng
 * @Date 2019/11/21
 **/
public class Building {

    private String ground ;

    private String cement;

    private String roof;

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getCement() {
        return cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
