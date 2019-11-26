package com.alibaba.filter.service.impl;

import com.alibaba.filter.model.Rubbish;
import com.alibaba.filter.service.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class HarmRubbishCriteria implements Criteria {
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> result = rubbishes.stream().filter(Rubbish::getIsHarm).collect(Collectors.toList());
        return result;
    }
}
