package com.example.house.service;

import com.example.house.dao.EmpMapper;
import com.example.house.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: yrh
 * @Date: 2019-07-29 20:30
 * @version:
 * @Wish: 愿人间永无bug！
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public List<Map> queryByEname(Map map) {
        return empMapper.queryByEname(map);
    }
}
