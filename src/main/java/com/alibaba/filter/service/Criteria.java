package com.alibaba.filter.service;

import com.alibaba.filter.model.Rubbish;

import java.util.List;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/
public interface Criteria {

    List<Rubbish> rubbishFilter(List<Rubbish> rubbishes);
}
