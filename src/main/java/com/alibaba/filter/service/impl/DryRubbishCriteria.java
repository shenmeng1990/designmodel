package com.alibaba.filter.service.impl;

import com.alibaba.filter.model.Rubbish;
import com.alibaba.filter.service.Criteria;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author shenmeng
 * @Date 2019/11/26
 **/

public class DryRubbishCriteria implements Criteria {
    @Override
    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishes) {
        List<Rubbish> list = rubbishes.stream().filter(Rubbish::getIsDry).collect(Collectors.toList());
        return list;
    }
}
