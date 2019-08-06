package com.example.house.service;

import com.example.house.entity.Rented;

import java.util.List;
import java.util.Map;


public interface RentedService {
    int save(Rented rented);

    int update(Rented rented);

    List<Map> queryAll(Map map);

    /**
     * 查询分页总数量
     * @param map
     * @return
     */
    int queryPageCount(Map map);

    int updateA(Rented rented);
}
