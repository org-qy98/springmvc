package com.example.house.service;

import com.example.house.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * @Author: yrh
 * @Date: 2019-07-29 20:30
 * @version:
 * @Wish: 愿人间永无bug！
 */
public interface EmpService {
    int insert(Emp record);
    List<Map> queryByEname(Map map);

}
