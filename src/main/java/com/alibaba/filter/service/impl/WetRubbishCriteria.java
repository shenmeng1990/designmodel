package com.alibaba.filter.service.impl;

import com.alibaba.filter.model.Rubbish;
import com.alibaba.filter.service.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class WetRubbishCriteria implements Criteria {
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> result = rubbishes.stream().filter(Rubbish::getIsWet).collect(Collectors.toList());
        return result;

    }
}
