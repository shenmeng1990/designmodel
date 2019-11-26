package com.alibaba.filter.model;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/
@Data
@AllArgsConstructor
public class Rubbish {

    private String name;

    private Boolean isHarm;

    private Boolean isRecycled;

    private Boolean isDry;

    private Boolean isWet;
}
